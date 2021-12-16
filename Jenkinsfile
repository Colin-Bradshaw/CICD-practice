pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "hello"'
		sh 'git pull https://github.com/Colin-Bradshaw/CICD-practice.git'
                sh 'mvn -B -DskipTests clean package'
		sh 'java -jar /home/thewalrus/.jenkins/workspace/BookingPipeline/target/springproject-0.0.1-SNAPSHOT.jar'
                }
            }
   } 
}
