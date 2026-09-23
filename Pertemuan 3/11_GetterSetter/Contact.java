// Ini file JAVA (bukan Kotlin), sebagai perbandingan dengan getter/setter di Kotlin
public class Contact {
  // 'private' = field hanya bisa diakses dari dalam class ini
  private String name;

  // Getter: method untuk membaca nilai name
  public String getName() {
    return name;
  }

  // Setter: method untuk mengubah nilai name
  public void setName(String name) {
    this.name = name;   // 'this.name' = field milik class, 'name' = parameter
  }
}

// Class tambahan yang berisi main() untuk menjalankan program Java
class ContactMain {
  public static void main(String[] args) {
    // Membuat objek Contact
    Contact contact = new Contact();

    // Mengisi nama lewat setter
    contact.setName("Angga Dwi Saputro");

    // Membaca nama lewat getter lalu mencetaknya
    // Output: Angga Dwi Saputro
    System.out.println(contact.getName());
  }
}
