def call(String status, String channel) {
    if (status == 'SUCCESS') {
        slackSend channel: 'msn', message: 'Success'
    } else {
        slackSend channel: 'msn', message: 'Fail'
    }
}
