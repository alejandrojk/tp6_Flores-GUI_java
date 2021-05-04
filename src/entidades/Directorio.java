package entidades;


import entidades.Cliente;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Directorio {
    
    private TreeMap<Long, Cliente>lista;

    public Directorio() {
        lista = new TreeMap<>();
    }
    
    
    public int agregarCliente(Long tel, Cliente cliente){
       lista.put(tel, cliente);
       
        return 1;
    }
    
    public Cliente buscarCliente(long tel){
        return lista.get(tel);
    }
    public List<Long> buscarTelefono(String ape){
      List<Long> aux = null;  
      Set<Long> telefono = lista.keySet();
      for(Long i:telefono){
          if(lista.get(i).getApellido().equalsIgnoreCase(ape)){
             aux.add(i);
          }
      }
        return aux;
    }
    
    public List<Cliente> buscarCliente(String ciudad){
        return lista.values().stream().filter(cliente ->cliente.getCiudad()==ciudad).collect(Collectors.toList());
    }
    public int borrarCliente(long dni){
        lista.forEach((k, v) -> {
            if(v.getDni() == dni){
                lista.remove(k);
            }
        });
        return 0;
    }
    
}
