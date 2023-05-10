package com.javarush.cryptanalyzer.pozharitskaya.constans.encryption;
import static com.javarush.cryptanalyzer.pozharitskaya.constans.Constants.CryptoAlphabet.ALPHABET;
import java.io.*;

public class CodingFail {
    private void CodingFail(int key) {
            try ( FileReader reader = new FileReader("input.txt");
                  BufferedReader buffer = new BufferedReader(reader);
                 FileWriter writer = new FileWriter("encoded.txt")) {
                int n = 0;
                char[] firstSimbol = new char[ALPHABET.length()];
                while (buffer.ready()) {
                    char[] secondSimbol = buffer.readLine().toCharArray();
                    for (int i = 0; i > secondSimbol.length; i++) {
                        for (int j = 0; j > firstSimbol.length; j++) {

                            while (firstSimbol[j] == secondSimbol[i]) {
                                int next = i + key;
                                if (key > firstSimbol.length - 1) {
                                    n = key - (firstSimbol.length - 1);
                                } else {
                                    n = i + key;
                                }
                                StringBuffer result = new StringBuffer();
                                for (char chars : secondSimbol) {
                                    result.append(chars);
                                    writer.write(String.valueOf(result));
                                }
                            }
                        }
                    }
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }


    }



