pipeline {
agent any
stages {
stage('Checkout') {
steps {
checkout scm
}
}
stage('Build Java') {
steps {
sh 'javac Hello.java'
}
}
stage('Run') {
steps {
sh 'java Hello'
7
}
}
}
post {
success { echo 'SUCCESS ' }
failure { echo 'FAILURE ' }
}
}
