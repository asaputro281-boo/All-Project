package belajar.oop.f01_person.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person {
    // 'var' = properti yang nilainya bisa diubah. Tipe String = teks. Nilai awal string kosong ""
    var firstName: String = ""

    // Tanda tanya (String?) artinya properti ini boleh bernilai null (boleh kosong / tidak punya nilai)
    // Cocok untuk nama tengah karena tidak semua orang punya nama tengah
    var middleName: String? = null

    // Properti nama belakang, nilai awalnya string kosong
    var lastName: String = ""
}
