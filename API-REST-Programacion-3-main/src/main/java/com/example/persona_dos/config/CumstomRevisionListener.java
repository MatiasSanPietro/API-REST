package com.example.persona_dos.config;

import com.example.persona_dos.audit.Revision;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionListener;

public class CumstomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
