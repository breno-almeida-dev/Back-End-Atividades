package com.aulaback.aula;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoracontroller")
public class CalculadoraController {

    // 1
    @GetMapping("/soma/{a}/{b}")
    public String soma(@PathVariable double a, @PathVariable double b) {
        double resultado = a + b;
        return "Soma: " + resultado;
    }

    // 2
    @GetMapping("/subtrair")
    public String subtrair(@RequestParam double a, @RequestParam double b) {
        double resultado = a - b;
        return "Subtração: " + resultado;
    }

    // 3
    @GetMapping("/multiplicar/{a}/{b}")
    public String multiplicar(@PathVariable double a, @PathVariable double b) {
        double resultado = a * b;
        return "Multiplicação: " + resultado;
    }

    // 4
    @GetMapping("/dividir")
    public String dividir(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Erro: divisão por zero não é permitida.";
        }

        double resultado = a / b;
        return "Divisão: " + resultado;
    }

    // 5
    @GetMapping("/quadrado/{numero}")
    public String quadrado(@PathVariable double numero) {
        double resultado = numero * numero;
        return "Quadrado de " + numero + ": " + resultado;
    }

    // 6
    @GetMapping("/celsius-para-fahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return "Temperatura em Fahrenheit: " + fahrenheit;
    }

    // 7
    @GetMapping("/imc")
    public String calcularImc(@RequestParam double peso, @RequestParam double altura) {
        if (altura <= 0) {
            return "Erro: a altura deve ser maior que zero.";
        }

        double imc = peso / (altura * altura);
        return "IMC: " + imc;
    }

    // 8
    @GetMapping("/antecessor-sucessor/{numero}")
    public Map<String, Integer> antecessorSucessor(@PathVariable int numero) {
        Map<String, Integer> resultado = new LinkedHashMap<>();
        resultado.put("numero", numero);
        resultado.put("antecessor", numero - 1);
        resultado.put("sucessor", numero + 1);
        return resultado;
    }

    // 9
    @GetMapping("/desconto")
    public String calcularDesconto(@RequestParam double valor, @RequestParam double percentual) {
        double valorFinal = valor - (valor * percentual / 100);
        return "Valor final com desconto: " + valorFinal;
    }

    // 10
    @GetMapping("/tabuada/{numero}")
    public Map<String, Integer> tabuada(@PathVariable int numero) {
        Map<String, Integer> resultado = new LinkedHashMap<>();

        for (int i = 1; i <= 10; i++) {
            resultado.put(numero + " x " + i, numero * i);
        }

        return resultado;
    }
}