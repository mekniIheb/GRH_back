
create table COLLABORATEUR
(
    ID_COLLABORATEUR        NUMBER(19) not null
        primary key,
    ADRESSE                 VARCHAR2(255 char),
    ANNEE_EXPERIENCE        NUMBER(10),
    CERTIFICATIONS          VARCHAR2(255 char),
    CIN                     VARCHAR2(8 char),
    COLLABORATEUR           VARCHAR2(255 char),
    COMMENTAIRE             VARCHAR2(255 char),
    CREEA                   DATE,
    DATE_DE_NAISSANCE       TIMESTAMP(6),
    EMAIL                   VARCHAR2(255 char),
    MODIFIEEA               DATE,
    NATURE_ETUDE            VARCHAR2(255 char),
    NIVEAU_ETUDE            VARCHAR2(255 char),
    NOM_COMPLET             VARCHAR2(255 char),
    NUMERO_DU_COMPTE        NUMBER(19),
    NUMERO_SECURITE_SOCIALE NUMBER(19),
    NUMERO_TELEPHONE        VARCHAR2(255 char),
    RECOMENDATION           NUMBER(1)
)