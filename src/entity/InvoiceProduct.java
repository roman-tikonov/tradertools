/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 *
 * @author е
 */
@SequenceGenerator(
    name="SEQ_GEN",
    sequenceName="invoice_product_id_seq",
    allocationSize=1
)
@Entity
@Table(name = "invoice_product")
//@NamedQueries({@NamedQuery(name = "InvoiceProduct.findAll", query = "SELECT i FROM InvoiceProduct i"), @NamedQuery(name = "InvoiceProduct.findById", query = "SELECT i FROM InvoiceProduct i WHERE i.id = :id"), @NamedQuery(name = "InvoiceProduct.findByPrice", query = "SELECT i FROM InvoiceProduct i WHERE i.price = :price"), @NamedQuery(name = "InvoiceProduct.findByAmount", query = "SELECT i FROM InvoiceProduct i WHERE i.amount = :amount"), @NamedQuery(name = "InvoiceProduct.findByCost", query = "SELECT i FROM InvoiceProduct i WHERE i.cost = :cost")})
public class InvoiceProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "price")
    private BigDecimal price;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Generated(GenerationTime.INSERT)
    @Column(name = "cost", insertable = false)
    private BigDecimal cost; //при записи в базу рассчитывается триггером
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Invoice invoice;
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Product product;

    public InvoiceProduct() {
    }

//    public InvoiceProduct(Integer id) {
//        this.id = id;
//    }

    public InvoiceProduct(Integer id, BigDecimal price, int amount) {
        this.id = id;
        this.price = price;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        setCost(calcCost(this));
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        setCost(calcCost(this));
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof InvoiceProduct)) {
            return false;
        }
        InvoiceProduct other = (InvoiceProduct) object;
        return (other.getProduct().equals(this.getProduct()));
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
    }

    @Override
    public String toString() {
        return getProduct().toString();
    }

    public static BigDecimal calcCost(InvoiceProduct ip) {
        return ip.getPrice().multiply(new BigDecimal(ip.getAmount()));
    }
}
