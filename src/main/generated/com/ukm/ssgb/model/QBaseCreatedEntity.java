package com.ukm.ssgb.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseCreatedEntity is a Querydsl query type for BaseCreatedEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseCreatedEntity extends EntityPathBase<BaseCreatedEntity> {

    private static final long serialVersionUID = -173770490L;

    public static final QBaseCreatedEntity baseCreatedEntity = new QBaseCreatedEntity("baseCreatedEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public QBaseCreatedEntity(String variable) {
        super(BaseCreatedEntity.class, forVariable(variable));
    }

    public QBaseCreatedEntity(Path<? extends BaseCreatedEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseCreatedEntity(PathMetadata metadata) {
        super(BaseCreatedEntity.class, metadata);
    }

}

