class Person (val firstName: String, val lastName: String){

    var nickName: String? = null
        set(value) {
            field=value
            println("The new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }


    init {
        println("Init 1")
    }

     // Secondary constructor
    constructor(): this("Peter", "Parker") {
        println("Secondary constructor")
    }

    init {
        println("Init 2")
    }


    fun printInfo(){
        //val nickNameToPrint = if(nickName!=null) nickName else "No NickName"
        val nickNameToPrint = nickName ?: "No NickName"
        println("$firstName ($nickNameToPrint) $lastName")
    }


}