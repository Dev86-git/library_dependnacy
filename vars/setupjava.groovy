def call(cmd) {
   sh "sudo apt update"
    echo " installing  ${cmd}"  
    echo " ${cmd}"  
    sh "sudo apt install -y ${cmd}"
}
