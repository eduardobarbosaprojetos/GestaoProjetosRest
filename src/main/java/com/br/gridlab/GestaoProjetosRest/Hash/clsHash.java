/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.gridlab.GestaoProjetosRest.Hash;

/**
 *
 * @author gr001290
 */
import java.io.ByteArrayOutputStream;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class clsHash {
   byte[] keyValue = new byte[]{35, 115, 86, 114, 64, 103, 114, 105};
   byte[] ivValue = new byte[]{35, 115, 86, 114, 64, 108, 97, 98};

   public String criptografar(String inputText) throws Exception {
      ByteArrayOutputStream bout = new ByteArrayOutputStream();

      try {
         KeySpec keySpec = new DESKeySpec(this.keyValue);
         SecretKey key = SecretKeyFactory.getInstance("DES").generateSecret(keySpec);
         IvParameterSpec iv = new IvParameterSpec(this.ivValue);
         Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
         cipher.init(1, key, iv);
         bout.write(cipher.doFinal(inputText.getBytes("ASCII")));
      } catch (Exception var7) {
         System.out.println("Exception .. " + var7.getMessage());
      }

      return new String(Base64.getEncoder().encode(bout.toByteArray()), "ASCII");
   }

   public String descriptografar(String texto) throws Exception {
      ByteArrayOutputStream bout = new ByteArrayOutputStream();

      try {
         KeySpec keySpec = new DESKeySpec(this.keyValue);
         SecretKey key = SecretKeyFactory.getInstance("DES").generateSecret(keySpec);
         IvParameterSpec iv = new IvParameterSpec(this.ivValue);
         Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
         cipher.init(2, key, iv);
         byte[] decoded = Base64.getDecoder().decode(texto.getBytes("ASCII"));
         bout.write(cipher.doFinal(decoded));
      } catch (Exception var8) {
         System.out.println("Exception ... " + var8);
      }

      return new String(bout.toByteArray(), "ASCII");
   }
}