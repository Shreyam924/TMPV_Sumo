package com.excelfore.TMPV.Entities;

import com.excelfore.TMPV.CatalogueType;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Map;


@Entity
public class CatalogueItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String version;

    private String containerId;

    @Column(nullable = false)
    private Long fileSize;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CatalogueType type;

    @Column(nullable = false)
    private String ecuName;

    private String s3Uri;

    @ElementCollection
    @CollectionTable(name = "catalogue_additional_attributes", joinColumns = @JoinColumn(name = "catalogue_id"))
    @MapKeyColumn(name = "attribute_name")
    @Column(name = "attribute_value")
    private Map<String, String> additionalAttributes;

    @Column(nullable = false)
    private LocalDate createdAt;

    private LocalDate updatedAt;

    @Column(nullable = false)
    private String createdBy;

    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public CatalogueType getType() {
        return type;
    }

    public void setType(CatalogueType type) {
        this.type = type;
    }

    public String getEcuName() {
        return ecuName;
    }

    public void setEcuName(String ecuName) {
        this.ecuName = ecuName;
    }

    public String getS3Uri() {
        return s3Uri;
    }

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    public Map<String, String> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(Map<String, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public CatalogueItem() {
    }

    public CatalogueItem(Long id, String version, String containerId, Long fileSize, CatalogueType type, String ecuName, String s3Uri, Map<String, String> additionalAttributes, LocalDate createdAt, LocalDate updatedAt, String createdBy, String updatedBy) {
        this.id = id;
        this.version = version;
        this.containerId = containerId;
        this.fileSize = fileSize;
        this.type = type;
        this.ecuName = ecuName;
        this.s3Uri = s3Uri;
        this.additionalAttributes = additionalAttributes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }
// Additional constructors, getters and setters can be generated
}

