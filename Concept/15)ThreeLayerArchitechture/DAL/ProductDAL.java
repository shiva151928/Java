package org.example.DAL;

import org.example.models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAL {

    private Connection con;

    public ProductDAL() throws SQLException {
        String constr = "jdbc:sqlserver://SKY\\SQLEXPRESS;databaseName=issjavadb;encrypt=true;trustServerCertificate=true";
        con = DriverManager.getConnection(constr, "sa", "iss@123#");
    }

    public boolean save(Product product) throws SQLException {
        String sql = "INSERT INTO producttbl (pid, pname, price) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, product.getPid());
            pstmt.setString(2, product.getPname());
            pstmt.setDouble(3, product.getPrice());

            return pstmt.executeUpdate() > 0;
        }
    }

    public List<Product> getProducts() throws SQLException {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT pid, pname, price FROM producttbl";

        try (PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Product p = new Product();
                p.setPid(rs.getInt("pid"));
                p.setPname(rs.getString("pname"));
                p.setPrice(rs.getDouble("price"));
                products.add(p);
            }
        }

        return products;
    }

    public boolean updateProduct(Product product) throws SQLException {
        String sql = "UPDATE producttbl SET pname = ?, price = ? WHERE pid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, product.getPname());
            pstmt.setDouble(2, product.getPrice());
            pstmt.setInt(3, product.getPid());

            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean deleteProduct(int id) throws SQLException {
        String sql = "DELETE FROM producttbl WHERE pid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;
        }
    }

    public Product findById(int id) throws SQLException {
        String sql = "SELECT pid, pname, price FROM producttbl WHERE pid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Product p = new Product();
                    p.setPid(rs.getInt("pid"));
                    p.setPname(rs.getString("pname"));
                    p.setPrice(rs.getDouble("price"));
                    return p;
                }
            }
        }

        return null;
    }

    public List<Product> findByPrice(double price) throws SQLException {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT pid, pname, price FROM producttbl WHERE price > ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setDouble(1, price);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Product p = new Product();
                    p.setPid(rs.getInt("pid"));
                    p.setPname(rs.getString("pname"));
                    p.setPrice(rs.getDouble("price"));
                    products.add(p);
                }
            }
        }

        return products;
    }
}
