pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "hello"'
		sh 'git https://github.com/Colin-Bradshaw/CICD-practice.git'
                sh 'mvn -B -DskipTests clean package'
		sh 'java -jar /target/springproject-0.0.1-SNAPSHOT.jar'
                }
            }
   } 
}
