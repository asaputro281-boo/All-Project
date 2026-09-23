package belajar.oop.f01_person.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Bagian di dalam kurung setelah nama class adalah PRIMARY CONSTRUCTOR
// Parameter (firstNameParam, dst.) adalah data yang harus dikirim saat objek dibuat
class Person(firstNameParam: String,
             middleNameParam: String?,   // tanda ? = boleh diisi null
             lastNameParam: String) {

    // Nilai parameter constructor dipindahkan ke properties milik class
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}
