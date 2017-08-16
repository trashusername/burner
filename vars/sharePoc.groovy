def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node {
        echo "this code ran, here's an option:"
        echo "${config.poc}"
    }
}
