package com.presupuesto_app.config;

import com.presupuesto_app.model.AuditableEntity;
import org.springframework.data.r2dbc.mapping.event.BeforeConvertCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Component
public class EntityCallback implements BeforeConvertCallback<AuditableEntity> {

    @Override
    public Mono<AuditableEntity> onBeforeConvert(AuditableEntity e, SqlIdentifier table) {

            if (e.getCreatedAt() == null) e.setCreatedAt(LocalDateTime.now());
            e.setUpdatedAt(LocalDateTime.now());
            return Mono.just(e);

    }

}

