package @packageName@.interfaces.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:api-doc.properties")
@ConfigurationProperties(prefix = "api-doc")
public class ApiDocConfig {
    
    private String title;
    private String description;
    private String version;
    private String termsOfServiceUrl;
    private String contactName;
    private String contactUrl;
    private String contactEmail;
    private String license;
    private String licenseUrl;
    private String endpointExclusionList;
    private String contentType;
    private boolean useDefaultResponseMessage;
    private boolean enableUrlTemplate;
    private String apiKeyName;
    private String apiKeyKeyName;
    private String apiKeyPassAs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getEndpointExclusionList() {
        return endpointExclusionList;
    }

    public void setEndpointExclusionList(String endpointExclusionList) {
        this.endpointExclusionList = endpointExclusionList;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public boolean isUseDefaultResponseMessage() {
        return useDefaultResponseMessage;
    }

    public void setUseDefaultResponseMessage(boolean useDefaultResponseMessage) {
        this.useDefaultResponseMessage = useDefaultResponseMessage;
    }

    public boolean isEnableUrlTemplate() {
        return enableUrlTemplate;
    }

    public void setEnableUrlTemplate(boolean enableUrlTemplate) {
        this.enableUrlTemplate = enableUrlTemplate;
    }

    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    public String getApiKeyKeyName() {
        return apiKeyKeyName;
    }

    public void setApiKeyKeyName(String apiKeyKeyName) {
        this.apiKeyKeyName = apiKeyKeyName;
    }

    public String getApiKeyPassAs() {
        return apiKeyPassAs;
    }

    public void setApiKeyPassAs(String apiKeyPassAs) {
        this.apiKeyPassAs = apiKeyPassAs;
    }    
}