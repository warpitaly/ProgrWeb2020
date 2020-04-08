package it.units.progrweb2020.dataaccess;

import com.healthmarketscience.jackcess.ColumnBuilder;
import com.healthmarketscience.jackcess.DataType;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.TableBuilder;
import java.io.File;

/**
 *
 * @author giorgio
 */
public class Access {
  public static void main(String[] args){
    try{
      Database db = DatabaseBuilder.create(Database.FileFormat.V2000, new File("access.mdb"));
      Table tbl = new TableBuilder("Studenti")
              .addColumn(new ColumnBuilder("Nome", DataType.TEXT))
              .addColumn(new ColumnBuilder("Cognome", DataType.TEXT))
              .toTable(db);
      
      tbl.addRow("Giorgio", "Davanzo");
      tbl.addRow("Jean-Luc", "Picard");
      
      for(String nome : db.getSystemTableNames()){
        System.out.println("Ho trovato la tabella di sistema: " + nome);
      } 
      
      for(String nome : db.getTableNames()){
        System.out.println("Ho trovato la tabella: " + nome);
      } 
      
      for(Row riga : tbl){
        System.out.println("Riga: " + riga);
      }
      
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
