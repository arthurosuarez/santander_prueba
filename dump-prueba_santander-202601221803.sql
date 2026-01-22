--
-- PostgreSQL database dump
--

\restrict dOxbc9aspGnTXqeOl8MuQqFHNYiRPQWon3lOYtGoDzbi0Pnse4KhT8pAVx9TW5X

-- Dumped from database version 17.7
-- Dumped by pg_dump version 17.7

-- Started on 2026-01-22 18:03:01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 24600)
-- Name: card; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.card (
    cardid character varying NOT NULL,
    cardnumber character varying NOT NULL,
    holdername character varying NOT NULL,
    issuedat time without time zone NOT NULL,
    expiresat time without time zone NOT NULL,
    status character varying NOT NULL,
    blockedat time without time zone,
    blockedreason time without time zone,
    balance numeric,
    currency character varying
);


ALTER TABLE public.card OWNER TO postgres;

--
-- TOC entry 4910 (class 0 OID 0)
-- Dependencies: 218
-- Name: COLUMN card.expiresat; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.card.expiresat IS 'fecha Expliracion ->
expiresAt + 3 years';


--
-- TOC entry 219 (class 1259 OID 24609)
-- Name: product; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.product (
    name character varying,
    type character varying
);


ALTER TABLE public.product OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 24584)
-- Name: titular; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.titular (
    id integer NOT NULL,
    documento integer NOT NULL,
    tipo_documento character varying,
    nombres character varying,
    apellidos character varying,
    fecha_nacimiento date
);


ALTER TABLE public.titular OWNER TO postgres;

--
-- TOC entry 4903 (class 0 OID 24600)
-- Dependencies: 218
-- Data for Name: card; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.card (cardid, cardnumber, holdername, issuedat, expiresat, status, blockedat, blockedreason, balance, currency) FROM stdin;
\.


--
-- TOC entry 4904 (class 0 OID 24609)
-- Dependencies: 219
-- Data for Name: product; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.product (name, type) FROM stdin;
Tarjeta Visa	CREDIT
Tarjeta Visa	DEBIT
\.


--
-- TOC entry 4902 (class 0 OID 24584)
-- Dependencies: 217
-- Data for Name: titular; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.titular (id, documento, tipo_documento, nombres, apellidos, fecha_nacimiento) FROM stdin;
1	10566666	CC	Johan	Suarez	2000-01-01
\.


--
-- TOC entry 4754 (class 2606 OID 24606)
-- Name: card card_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.card
    ADD CONSTRAINT card_pk PRIMARY KEY (cardid);


--
-- TOC entry 4756 (class 2606 OID 24608)
-- Name: card card_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.card
    ADD CONSTRAINT card_unique UNIQUE (cardnumber);


--
-- TOC entry 4750 (class 2606 OID 24590)
-- Name: titular titutal_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.titular
    ADD CONSTRAINT titutal_pk PRIMARY KEY (id);


--
-- TOC entry 4752 (class 2606 OID 24592)
-- Name: titular titutal_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.titular
    ADD CONSTRAINT titutal_unique UNIQUE (documento);


-- Completed on 2026-01-22 18:03:02

--
-- PostgreSQL database dump complete
--

\unrestrict dOxbc9aspGnTXqeOl8MuQqFHNYiRPQWon3lOYtGoDzbi0Pnse4KhT8pAVx9TW5X

