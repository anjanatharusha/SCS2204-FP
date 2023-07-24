object CaesarCipher {
  def encrypt(text: String, shift: Int): String = {
    text.map { c =>
      if (c.isLetter) {
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base + shift) % 26 + base).toChar
      } else {
        c
      }
    }
  }

  def decrypt(cipherText: String, shift: Int): String = {
    encrypt(cipherText, -shift)
  }
}

object Cipher {
  def applyTransformation(text: String, func: (String, Int) => String, shift: Int): String = {
    func(text, shift)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val plaintext = "Testing Caesar Cipher"
    val shift = 5

    val encryptedText = Cipher.applyTransformation(plaintext, CaesarCipher.encrypt, shift)
    val decryptedText = Cipher.applyTransformation(encryptedText, CaesarCipher.decrypt, shift)

    println("Original Text: " + plaintext)
    println("Encrypted Text: " + encryptedText)
    println("Decrypted Text: " + decryptedText)
  }
}
