def call(String status, String channel) {
    if (status == 'SUCCESS') {
        echo "Notifying ${channel}: Task completed successfully."
    } else {
        echo "Notifying ${channel}: Task failed."
    }
}
