/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lib.dao;

import com.mycompany.lib.entity.nguoidung;
import java.awt.List;

/**
 *
 * @author Admin
 */
public interface DAOinterfacee<T> {
    public T findByIdAndPassWork(T t);
    
}
