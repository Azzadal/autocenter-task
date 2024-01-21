const express = require('express');
const { createProxyMiddleware } = require('http-proxy-middleware');
const cors = require('cors');
const https = require('https');
const app = express();
const fs = require('fs');

// app.use(cors())

app.use(express.static('autocenter-task-ui/build'));

const port = process.env.PORT || 20000;

const privateKey  = fs.readFileSync('autocenter-task-ui/cert/local.key', 'utf8');
const certificate = fs.readFileSync('autocenter-task-ui/cert/local.cer', 'utf8');

const credentials = {key: privateKey, cert: certificate};

app.use((req, res, next) => {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
});

app.use('/api/v1', createProxyMiddleware({
    target: 'http://localhost:8443',
    secure: false,
}))

app.get('*', (req, res) => {
    // console.log('req', req);
    // console.log('res', res);
    res.sendFile('index.html', {
        root: 'autocenter-task-ui/build',
    });
});

const httpsServer = https.createServer(credentials, app);

httpsServer.listen(port, () => {
    console.log(`serving production build on port ${port}...`);
    console.log(`https://localhost:${port}`);
});