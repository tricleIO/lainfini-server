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

import java.util.Objects;


/**
 * Posstationsdevice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posstationsdevice   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("devicetype")
  private String devicetype = null;

  @SerializedName("devicedriver")
  private String devicedriver = null;

  @SerializedName("configuration")
  private byte[] _configuration = null;

  public Posstationsdevice displayname(String displayname) {
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

  public Posstationsdevice id(String id) {
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

  public Posstationsdevice classid(String classid) {
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

  public Posstationsdevice objversion(Integer objversion) {
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

  public Posstationsdevice parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu kasa pokladního prodeje [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu kasa pokladního prodeje [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Posstationsdevice devicetype(String devicetype) {
    this.devicetype = devicetype;
    return this;
  }

   /**
   * zařízení [persistentní položka]
   * @return devicetype
  **/
  @ApiModelProperty(example = "null", value = "zařízení [persistentní položka]")
  public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }

  public Posstationsdevice devicedriver(String devicedriver) {
    this.devicedriver = devicedriver;
    return this;
  }

   /**
   * ovladač [persistentní položka]
   * @return devicedriver
  **/
  @ApiModelProperty(example = "null", value = "ovladač [persistentní položka]")
  public String getDevicedriver() {
    return devicedriver;
  }

  public void setDevicedriver(String devicedriver) {
    this.devicedriver = devicedriver;
  }

  public Posstationsdevice _configuration(byte[] _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * konfigurace [persistentní položka]
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", value = "konfigurace [persistentní položka]")
  public byte[] getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(byte[] _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posstationsdevice posstationsdevice = (Posstationsdevice) o;
    return Objects.equals(this.displayname, posstationsdevice.displayname) &&
        Objects.equals(this.id, posstationsdevice.id) &&
        Objects.equals(this.classid, posstationsdevice.classid) &&
        Objects.equals(this.objversion, posstationsdevice.objversion) &&
        Objects.equals(this.parentId, posstationsdevice.parentId) &&
        Objects.equals(this.devicetype, posstationsdevice.devicetype) &&
        Objects.equals(this.devicedriver, posstationsdevice.devicedriver) &&
        Objects.equals(this._configuration, posstationsdevice._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, devicetype, devicedriver, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posstationsdevice {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    devicetype: ").append(toIndentedString(devicetype)).append("\n");
    sb.append("    devicedriver: ").append(toIndentedString(devicedriver)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
