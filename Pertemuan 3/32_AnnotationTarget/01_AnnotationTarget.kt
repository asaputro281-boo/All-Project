package belajar.oop.f32_annotationtarget.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Annotation Beta boleh dipasang pada: getter properti, field, dan parameter
@Target(AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.FIELD,
        AnnotationTarget.VALUE_PARAMETER)
annotation class Beta

// Satu parameter constructor bisa menjadi properti, field, dan parameter sekaligus.
// Karena itu perlu 'use-site target' agar jelas annotation dipasang di bagian mana:
//   @field:Beta  = dipasang pada field (tempat data disimpan)
//   @get:Beta    = dipasang pada getter
//   @param:Beta  = dipasang pada parameter constructor
class ExampleTarget(@field:Beta val firstName: String,
                    @get:Beta val middleName: String,
                    @param:Beta val lastName: String)

fun main() {
    val example = ExampleTarget("Angga", "Dwi", "Saputro")

    // Output: Angga Dwi Saputro
    println("${example.firstName} ${example.middleName} ${example.lastName}")
}
