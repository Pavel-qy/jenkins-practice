def call() {
    node{
        stage('SIL Test'){
            steps {
                sh 'python3 --version'
            }
        }
    }
}
