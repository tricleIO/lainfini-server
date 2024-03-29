/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Storeprice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Storeprice   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("pricerows")
  private List<Storepricerow> pricerows = new ArrayList<Storepricerow>();

  @SerializedName("pricelist_id")
  private String pricelistId = null;

  @SerializedName("pricelistvalidity_id")
  private String pricelistvalidityId = null;

  @SerializedName("deletedfrompricelist")
  private Boolean deletedfrompricelist = null;

  public Storeprice displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Storeprice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Storeprice classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Storeprice objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Storeprice storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skl. karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skl. karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Storeprice pricerows(List<Storepricerow> pricerows) {
    this.pricerows = pricerows;
    return this;
  }

  public Storeprice addPricerowsItem(Storepricerow pricerowsItem) {
    this.pricerows.add(pricerowsItem);
    return this;
  }

   /**
   * definice cen; kolekce bo ceníková cena [nepersistentní položka]
   * @return pricerows
  **/
  @ApiModelProperty(example = "null", value = "definice cen; kolekce bo ceníková cena [nepersistentní položka]")
  public List<Storepricerow> getPricerows() {
    return pricerows;
  }

  public void setPricerows(List<Storepricerow> pricerows) {
    this.pricerows = pricerows;
  }

  public Storeprice pricelistId(String pricelistId) {
    this.pricelistId = pricelistId;
    return this;
  }

   /**
   * ceník; id objektu ceník [persistentní položka]
   * @return pricelistId
  **/
  @ApiModelProperty(example = "null", value = "ceník; id objektu ceník [persistentní položka]")
  public String getPricelistId() {
    return pricelistId;
  }

  public void setPricelistId(String pricelistId) {
    this.pricelistId = pricelistId;
  }

  public Storeprice pricelistvalidityId(String pricelistvalidityId) {
    this.pricelistvalidityId = pricelistvalidityId;
    return this;
  }

   /**
   * datum platnosti; id objektu datové platnosti ceníku [persistentní položka]
   * @return pricelistvalidityId
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti; id objektu datové platnosti ceníku [persistentní položka]")
  public String getPricelistvalidityId() {
    return pricelistvalidityId;
  }

  public void setPricelistvalidityId(String pricelistvalidityId) {
    this.pricelistvalidityId = pricelistvalidityId;
  }

  public Storeprice deletedfrompricelist(Boolean deletedfrompricelist) {
    this.deletedfrompricelist = deletedfrompricelist;
    return this;
  }

   /**
   * položka odstraněna [persistentní položka]
   * @return deletedfrompricelist
  **/
  @ApiModelProperty(example = "null", value = "položka odstraněna [persistentní položka]")
  public Boolean getDeletedfrompricelist() {
    return deletedfrompricelist;
  }

  public void setDeletedfrompricelist(Boolean deletedfrompricelist) {
    this.deletedfrompricelist = deletedfrompricelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storeprice storeprice = (Storeprice) o;
    return Objects.equals(this.displayname, storeprice.displayname) &&
        Objects.equals(this.id, storeprice.id) &&
        Objects.equals(this.classid, storeprice.classid) &&
        Objects.equals(this.objversion, storeprice.objversion) &&
        Objects.equals(this.storecardId, storeprice.storecardId) &&
        Objects.equals(this.pricerows, storeprice.pricerows) &&
        Objects.equals(this.pricelistId, storeprice.pricelistId) &&
        Objects.equals(this.pricelistvalidityId, storeprice.pricelistvalidityId) &&
        Objects.equals(this.deletedfrompricelist, storeprice.deletedfrompricelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, storecardId, pricerows, pricelistId, pricelistvalidityId, deletedfrompricelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storeprice {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    pricerows: ").append(toIndentedString(pricerows)).append("\n");
    sb.append("    pricelistId: ").append(toIndentedString(pricelistId)).append("\n");
    sb.append("    pricelistvalidityId: ").append(toIndentedString(pricelistvalidityId)).append("\n");
    sb.append("    deletedfrompricelist: ").append(toIndentedString(deletedfrompricelist)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

