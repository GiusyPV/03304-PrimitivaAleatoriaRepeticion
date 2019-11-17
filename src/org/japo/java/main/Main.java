/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        final int PRIMI_MIN = 1;
        final int PRIMI_MAX = 49;
        final int NUM_X = 6;

        //Bucle
        for (int i = 0; i < NUM_X; i++) {

            //Generar el  numero
            int n = RND.nextInt(PRIMI_MAX - PRIMI_MIN + 1) + PRIMI_MIN;

            //Salida consola
            System.out.printf("Número %d ...: %d%n", i + 1, n);
        }

    }
}
