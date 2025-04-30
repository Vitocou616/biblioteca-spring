package com.ecomarket.Pedidos.controller;

import com.ecomarket.Pedidos.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1")
public class HolaController {

    @GetMapping("/saludar")
    public HashMap<Integer, String> decirHola() {

        HashMap<Integer, String> listado = new HashMap<>();
        listado.put(1, "hola get");
        listado.put(2, "chao get");

        return listado;
    }

    @PostMapping("/saludar/edit")
    public HashMap<Integer, String> decirHolaPost(@RequestBody Usuario usuario) {

        HashMap<Integer, String> listado = new HashMap<>();
        listado.put(1, "hola" + usuario.getNombre());
        listado.put(2, "chao" + usuario.getEmail());

        return listado;
    }
}
