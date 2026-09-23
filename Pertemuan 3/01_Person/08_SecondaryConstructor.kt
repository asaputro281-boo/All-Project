package belajar.oop.f01_person.p08 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    // SECONDARY CONSTRUCTOR: constructor tambahan yang hanya menerima nama depan dan belakang
    // ': this(...)' wajib memanggil primary constructor, dengan middleName diisi null
    constructor(firstNameParam: String, lastNameParam: String) :
            this(firstNameParam, null, lastNameParam) {
        // do something here  -> tempat menulis logika tambahan (opsional)
    }

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}
