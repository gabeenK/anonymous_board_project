package com.ukm.ssgb.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardBookmark is a Querydsl query type for BoardBookmark
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardBookmark extends EntityPathBase<BoardBookmark> {

    private static final long serialVersionUID = 1407892392L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardBookmark boardBookmark = new QBoardBookmark("boardBookmark");

    public final QBaseCreatedEntity _super = new QBaseCreatedEntity(this);

    public final QBoard board;

    public final NumberPath<Long> boardBookmarkId = createNumber("boardBookmarkId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdBy = _super.createdBy;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QBoardBookmark(String variable) {
        this(BoardBookmark.class, forVariable(variable), INITS);
    }

    public QBoardBookmark(Path<? extends BoardBookmark> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardBookmark(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardBookmark(PathMetadata metadata, PathInits inits) {
        this(BoardBookmark.class, metadata, inits);
    }

    public QBoardBookmark(Class<? extends BoardBookmark> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
    }

}

