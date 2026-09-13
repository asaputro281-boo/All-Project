fun main() {
    // ------------------------------------------
    // 7. KATEGORI: TIPE DATA ARRAY ANGGA
    // ------------------------------------------
    println("=== 7. TIPE DATA ARRAY ===")

    val members: Array<String> = arrayOf("Angga", "Dwi", "Saputro")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println("Member 0: ${members[0]}")
    println("Member 1: ${members.get(1)}")
    println("Member 2: ${members.get(2)}")

    // Operasi Array (Set / Ubah Data)
    members.set(0, "Pratama")
    println("Member 0 Setelah Diubah: ${members[0]}")

    // Array Nullable
    val namesNullable: Array<String?> = arrayOfNulls(5)
    namesNullable.set(0, "Angga")
    namesNullable.set(1, null)
    namesNullable.set(2, "Dwi")
    namesNullable.set(3, null)
    namesNullable.set(4, "Saputro")
    println("Array Nullable Index 0: ${namesNullable[0]}, Index 1: ${namesNullable[1]}")
    println()
}