/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author е
 */
@SequenceGenerator(
    name="SEQ_GEN",
    sequenceName="product_id_seq",
    allocationSize=1
)
@Entity
@Table(name = "product")
@NamedQueries({@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Column(name = "article")
    private String article;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne()
    private Category category;
    @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false)
    @ManyToOne()
    private Unit unit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private List<Supply> supplyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private List<InvoiceProduct> InvoiceProductCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", fetch = FetchType.LAZY)
    private List<RequestProduct> RequestProductCollection;

    public Product() {
    }

//    public Product(Integer id) {
//        this.id = id;
//    }

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, String article, Category category) {
        this.title = title;
        this.article = article;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Supply> getSupplyCollection() {
        return supplyCollection;
    }

    public void setSupplyCollection(List<Supply> supplyCollection) {
        this.supplyCollection = supplyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;       
        return this.getTitle().equals(other.getTitle());
    }

    @Override
    public String toString() {
        return getTitle();
    }

    /**
     * @return the InvoiceProductCollection
     */
    public List<InvoiceProduct> getInvoiceProductCollection() {
        return InvoiceProductCollection;
    }

    /**
     * @param InvoiceProductCollection the InvoiceProductCollection to set
     */
    public void setInvoiceProductCollection(List<InvoiceProduct> InvoiceProductCollection) {
        this.InvoiceProductCollection = InvoiceProductCollection;
    }

    /**
     * @return the RequestProductCollection
     */
    public List<RequestProduct> getRequestProductCollection() {
        return RequestProductCollection;
    }

    /**
     * @param RequestProductCollection the RequestProductCollection to set
     */
    public void setRequestProductCollection(List<RequestProduct> RequestProductCollection) {
        this.RequestProductCollection = RequestProductCollection;
    }

    /**
     * @return the unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

}
