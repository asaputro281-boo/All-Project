# Tabel Operator yang Bisa Di-overload (Slide 203 - 211)

Di slide, bagian ini berupa gambar tabel (bukan kode). Isinya:

## Unary Prefix Operator (slide 203)
| Expression | Translated to |
|---|---|
| +a | a.unaryPlus() |
| -a | a.unaryMinus() |
| !a | a.not() |

## Increment & Decrement (slide 204)
| Expression | Translated to |
|---|---|
| a++ | a.inc() + see below |
| a-- | a.dec() + see below |

## Aritmatik Operator (slide 205)
| Expression | Translated to |
|---|---|
| a + b | a.plus(b) |
| a - b | a.minus(b) |
| a * b | a.times(b) |
| a / b | a.div(b) |
| a % b | a.rem(b), a.mod(b) (deprecated) |
| a..b | a.rangeTo(b) |

## In Operator (slide 206)
| Expression | Translated to |
|---|---|
| a in b | b.contains(a) |
| a !in b | !b.contains(a) |

## Index Access Operator (slide 207)
| Expression | Translated to |
|---|---|
| a[i] | a.get(i) |
| a[i, j] | a.get(i, j) |
| a[i_1, ..., i_n] | a.get(i_1, ..., i_n) |
| a[i] = b | a.set(i, b) |
| a[i, j] = b | a.set(i, j, b) |
| a[i_1, ..., i_n] = b | a.set(i_1, ..., i_n, b) |

## Invoke Operator (slide 208)
| Expression | Translated to |
|---|---|
| a() | a.invoke() |
| a(i) | a.invoke(i) |
| a(i, j) | a.invoke(i, j) |
| a(i_1, ..., i_n) | a.invoke(i_1, ..., i_n) |

## Assignment Operator (slide 209)
| Expression | Translated to |
|---|---|
| a += b | a.plusAssign(b) |
| a -= b | a.minusAssign(b) |
| a *= b | a.timesAssign(b) |
| a /= b | a.divAssign(b) |
| a %= b | a.remAssign(b), a.modAssign(b) (deprecated) |

## Equality dan Inequality Operator (slide 210)
| Expression | Translated to |
|---|---|
| a == b | a?.equals(b) ?: (b === null) |
| a != b | !(a?.equals(b) ?: (b === null)) |

## Comparison Operator (slide 211)
| Expression | Translated to |
|---|---|
| a > b | a.compareTo(b) > 0 |
| a < b | a.compareTo(b) < 0 |
| a >= b | a.compareTo(b) >= 0 |
| a <= b | a.compareTo(b) <= 0 |
