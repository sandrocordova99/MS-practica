package com.example.Productos.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Productos.Config.ProductoConfig;
import com.example.Productos.Modelos.ProductosProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class ProductoControlador {

    @Autowired
    private ProductoConfig productoConfig;

    @GetMapping("/producto/read/properties")
	public String getPropertiesProducto() throws JsonProcessingException{
		ObjectWriter owj = new ObjectMapper().writer().withDefaultPrettyPrinter();
		ProductosProperties propProductos = new ProductosProperties(productoConfig.getMsg() , productoConfig.getBuildVersion() , productoConfig.getMailDetails());
		String jsonString = owj.writeValueAsString(propProductos);
		return jsonString;
	}
}
