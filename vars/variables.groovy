def check(){
    checkout scm
}


def crPackage(){
    sh 'mvn clean package'
}


def testUni{
    sh 'mvn test'
}