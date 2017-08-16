def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo "running"

    node {
        echo "this code ran, here's an option:"
        echo "${config.poc}"
        sh 'echo "Test" > test.txt'
        sh "ls"
        sh "pwd"
    }
}
