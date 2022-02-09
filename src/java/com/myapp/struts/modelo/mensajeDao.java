package com.myapp.struts.modelo;

import com.myapp.struts.form.mensajeForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mensajeDao extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    Connection con = null;

    //Registrar Usuario
    public mensajeForm registrar(mensajeForm obj) {
        mensajeForm bean = null;
        String sql = "insert into mensaje(nombre,apellido,email,fecha,usuario,password)values(?,?,?,?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setString(3, obj.getEmail());
            ps.setDate(4, obj.getFecha());
            ps.setString(5, obj.getUsuario());
            ps.setString(6, obj.getPassword());
            bean = new mensajeForm();
            ps.execute();
            con.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return bean;
    }

    //Validar Usuario
    public mensajeForm validar(mensajeForm obj) {
        mensajeForm bean = null;
        String sql = "select * from mensaje where usuario = ? and password = ?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, obj.getUsuario());
            ps.setString(2, obj.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                bean = new mensajeForm();
                bean.setUsuario(rs.getString("usuario"));
                bean.setPassword(rs.getString("password"));
            }
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return bean;
    }

}
