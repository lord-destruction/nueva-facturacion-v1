-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: alexanderflower
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anticipos`
--

DROP TABLE IF EXISTS `anticipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anticipos` (
  `cod_anticipo` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_anticipo` date DEFAULT NULL,
  `cod_empleado` varchar(10) DEFAULT NULL,
  `valor_anticipo` double(10,2) DEFAULT NULL,
  `concepto_anticipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_anticipo`),
  KEY `empleadoanti_idx` (`cod_empleado`),
  CONSTRAINT `empleadoanti` FOREIGN KEY (`cod_empleado`) REFERENCES `empleados` (`cedula_empleado`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anticipos`
--

LOCK TABLES `anticipos` WRITE;
/*!40000 ALTER TABLE `anticipos` DISABLE KEYS */;
/*!40000 ALTER TABLE `anticipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `asistencias`
--

DROP TABLE IF EXISTS `asistencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `asistencias` (
  `codigo_emple` varchar(10) NOT NULL,
  `fecha_actual` date NOT NULL,
  `hora_entrada` time DEFAULT '00:00:00',
  `hora_salida` time DEFAULT '00:00:00',
  `horas_tra` double(10,5) DEFAULT '0.00000',
  `horas_ext` double(10,5) DEFAULT '0.00000',
  `observacion_asis` varchar(45) DEFAULT NULL,
  `horasalidaa` time DEFAULT '00:00:00',
  `horaentradaa` time DEFAULT '00:00:00',
  `minutosr` int(11) DEFAULT '0',
  PRIMARY KEY (`codigo_emple`,`fecha_actual`),
  KEY `codigo_emplea` (`codigo_emple`),
  CONSTRAINT `codigo_emplea` FOREIGN KEY (`codigo_emple`) REFERENCES `empleados` (`cedula_empleado`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asistencias`
--

LOCK TABLES `asistencias` WRITE;
/*!40000 ALTER TABLE `asistencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `asistencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bancos`
--

DROP TABLE IF EXISTS `bancos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bancos` (
  `cod_banco` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_banco` varchar(45) NOT NULL,
  `sucursal_banco` varchar(45) DEFAULT NULL,
  `ciudad_banco` int(4) NOT NULL,
  `direccion_banco` varchar(45) NOT NULL,
  `telefono_banco` varchar(10) DEFAULT NULL,
  `email_banco` varchar(45) DEFAULT NULL,
  `estado_banco` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_banco`),
  UNIQUE KEY `nombre_banco_UNIQUE` (`nombre_banco`),
  KEY `ciudadba_idx` (`ciudad_banco`),
  CONSTRAINT `ciudadba` FOREIGN KEY (`ciudad_banco`) REFERENCES `ciudades` (`cod_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bancos`
--

LOCK TABLES `bancos` WRITE;
/*!40000 ALTER TABLE `bancos` DISABLE KEYS */;
/*!40000 ALTER TABLE `bancos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bodega`
--

DROP TABLE IF EXISTS `bodega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bodega` (
  `cod_bodega` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_bodega` varchar(25) NOT NULL,
  `estado_bodega` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_bodega`),
  UNIQUE KEY `nombre_bodega_UNIQUE` (`nombre_bodega`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bodega`
--

LOCK TABLES `bodega` WRITE;
/*!40000 ALTER TABLE `bodega` DISABLE KEYS */;
/*!40000 ALTER TABLE `bodega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cargos`
--

DROP TABLE IF EXISTS `cargos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cargos` (
  `cod_cargo` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_cargo` varchar(20) NOT NULL,
  `estado_cargo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_cargo`),
  UNIQUE KEY `nombre_cargo_UNIQUE` (`nombre_cargo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargos`
--

LOCK TABLES `cargos` WRITE;
/*!40000 ALTER TABLE `cargos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cargos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `cod_categoria` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(25) NOT NULL,
  `estado_categoria` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_categoria`),
  UNIQUE KEY `nombre_categoria_UNIQUE` (`nombre_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheques`
--

DROP TABLE IF EXISTS `cheques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheques` (
  `num_cuenta` varchar(45) NOT NULL,
  `num_cheque` varchar(20) NOT NULL,
  `monto_cheque` double(10,2) DEFAULT NULL,
  `fecha_cheque` date DEFAULT NULL,
  `paguese_cheque` varchar(13) DEFAULT NULL,
  `tipo_cheque` int(1) DEFAULT NULL,
  `referencia_cheque` varchar(45) DEFAULT NULL,
  `firma_cheque` varchar(45) DEFAULT NULL,
  `estado_cheque` tinyint(1) DEFAULT NULL,
  `pago_cheque` varchar(10) DEFAULT 'No Cobrado',
  PRIMARY KEY (`num_cheque`,`num_cuenta`),
  KEY `cuentach_idx` (`num_cuenta`),
  CONSTRAINT `cuentach` FOREIGN KEY (`num_cuenta`) REFERENCES `cuentascorr` (`num_cuentacorr`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheques`
--

LOCK TABLES `cheques` WRITE;
/*!40000 ALTER TABLE `cheques` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cieres`
--

DROP TABLE IF EXISTS `cieres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cieres` (
  `codigo_cierre` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_cierre` date NOT NULL,
  `ganancias` double(10,2) NOT NULL,
  `perdidas` double(10,2) NOT NULL,
  PRIMARY KEY (`codigo_cierre`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cieres`
--

LOCK TABLES `cieres` WRITE;
/*!40000 ALTER TABLE `cieres` DISABLE KEYS */;
/*!40000 ALTER TABLE `cieres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ciudades` (
  `cod_ciudad` int(4) NOT NULL AUTO_INCREMENT,
  `nombre_ciudad` varchar(20) NOT NULL,
  `cod_provincia` int(3) DEFAULT NULL,
  `estado_ciudad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_ciudad`),
  UNIQUE KEY `nombre_ciudad_UNIQUE` (`nombre_ciudad`),
  KEY `ciudadpro` (`cod_provincia`),
  CONSTRAINT `ciudadpro` FOREIGN KEY (`cod_provincia`) REFERENCES `provincias` (`cod_provincia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `cedula_cliente` varchar(10) NOT NULL,
  `nombres_cliente` varchar(25) NOT NULL,
  `apellidos_cliente` varchar(25) NOT NULL,
  `direccion_cliente` varchar(45) NOT NULL,
  `telefono_cliente` int(7) DEFAULT NULL,
  `ciudad_cliente` int(3) NOT NULL,
  `movil_cliente` varchar(10) DEFAULT NULL,
  `ruc_cliente` varchar(13) DEFAULT NULL,
  `estado_cliente` tinyint(1) NOT NULL,
  `email_cliente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cedula_cliente`),
  KEY `clientesciu` (`ciudad_cliente`),
  CONSTRAINT `clientesciu` FOREIGN KEY (`ciudad_cliente`) REFERENCES `ciudades` (`cod_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cparametros`
--

DROP TABLE IF EXISTS `cparametros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cparametros` (
  `cod_cparamentro` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `cod_cuenta` varchar(10) DEFAULT NULL,
  `nombre_cuenta` varchar(45) DEFAULT NULL,
  `debe` varchar(1) DEFAULT NULL,
  `haber` varchar(1) DEFAULT NULL,
  `cod_pcontabilidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_cparamentro`),
  KEY `pcontabilidad` (`cod_pcontabilidad`),
  CONSTRAINT `pcontabilidad` FOREIGN KEY (`cod_pcontabilidad`) REFERENCES `pcontabiidad` (`cod_pcontabiidad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cparametros`
--

LOCK TABLES `cparametros` WRITE;
/*!40000 ALTER TABLE `cparametros` DISABLE KEYS */;
/*!40000 ALTER TABLE `cparametros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas` (
  `cod_cuenta` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_cuenta` varchar(75) NOT NULL,
  `estado_cuenta` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_cuenta`),
  UNIQUE KEY `nombre_cuenta_UNIQUE` (`nombre_cuenta`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas_cobrar`
--

DROP TABLE IF EXISTS `cuentas_cobrar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas_cobrar` (
  `codigo_cobrar` int(30) NOT NULL AUTO_INCREMENT,
  `numero_factura` int(10) NOT NULL,
  `numero_cuota` varchar(10) NOT NULL,
  `interes` double(10,2) NOT NULL,
  `monto amortizacion` double(10,2) DEFAULT NULL,
  `monto_cuota` double(10,2) NOT NULL,
  `estado_cuota` tinyint(1) NOT NULL,
  `fecha_cobrar` date DEFAULT NULL,
  PRIMARY KEY (`codigo_cobrar`),
  KEY `facturavecod_idx` (`numero_factura`),
  CONSTRAINT `facturavecod` FOREIGN KEY (`numero_factura`) REFERENCES `facturasve` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas_cobrar`
--

LOCK TABLES `cuentas_cobrar` WRITE;
/*!40000 ALTER TABLE `cuentas_cobrar` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentas_cobrar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas_pagar`
--

DROP TABLE IF EXISTS `cuentas_pagar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas_pagar` (
  `codigo_pagar` int(30) NOT NULL AUTO_INCREMENT,
  `numero_factura` int(10) NOT NULL,
  `numero_cuota` varchar(10) NOT NULL,
  `interes` double(10,2) NOT NULL,
  `monto_amortizacion` double(10,2) DEFAULT NULL,
  `monto_cuota` double(10,2) NOT NULL,
  `estado_cuota` tinyint(1) NOT NULL,
  `fecha_pagar` date DEFAULT NULL,
  PRIMARY KEY (`codigo_pagar`),
  KEY `facturacocod_idx` (`numero_factura`),
  CONSTRAINT `facturacocod` FOREIGN KEY (`numero_factura`) REFERENCES `facturasco` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas_pagar`
--

LOCK TABLES `cuentas_pagar` WRITE;
/*!40000 ALTER TABLE `cuentas_pagar` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentas_pagar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentascorr`
--

DROP TABLE IF EXISTS `cuentascorr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentascorr` (
  `num_cuentacorr` varchar(45) NOT NULL,
  `cod_banco` int(3) NOT NULL,
  `des_cuentacorr` varchar(45) DEFAULT NULL,
  `saldo_cuentacorr` double(10,2) DEFAULT NULL,
  `estado_cuenta` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`num_cuentacorr`),
  KEY `bancocue_idx` (`cod_banco`),
  CONSTRAINT `bancocue` FOREIGN KEY (`cod_banco`) REFERENCES `bancos` (`cod_banco`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentascorr`
--

LOCK TABLES `cuentascorr` WRITE;
/*!40000 ALTER TABLE `cuentascorr` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentascorr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamentos` (
  `cod_dep` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_dep` varchar(20) NOT NULL,
  `estado_dep` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_dep`),
  UNIQUE KEY `nombre_dep_UNIQUE` (`nombre_dep`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deporeti`
--

DROP TABLE IF EXISTS `deporeti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deporeti` (
  `num_cuentacorr` varchar(45) NOT NULL,
  `cod_deporeti` int(11) NOT NULL AUTO_INCREMENT,
  `emision` date DEFAULT NULL,
  `tipo_deporeti` varchar(10) DEFAULT NULL,
  `monto_depo` double(10,2) DEFAULT NULL,
  `referencia_deporeti` varchar(45) DEFAULT NULL,
  `estado_deporeti` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_deporeti`,`num_cuentacorr`),
  KEY `cuentadprt_idx` (`num_cuentacorr`),
  CONSTRAINT `cuentadprt` FOREIGN KEY (`num_cuentacorr`) REFERENCES `cuentascorr` (`num_cuentacorr`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deporeti`
--

LOCK TABLES `deporeti` WRITE;
/*!40000 ALTER TABLE `deporeti` DISABLE KEYS */;
/*!40000 ALTER TABLE `deporeti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_facturaco`
--

DROP TABLE IF EXISTS `detalle_facturaco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_facturaco` (
  `cod_detallefaco` int(20) NOT NULL AUTO_INCREMENT,
  `cantidad_detalle` int(11) NOT NULL,
  `cod_producto` int(3) NOT NULL,
  `producto_detalle` varchar(45) NOT NULL,
  `valor_unitario` double(10,2) NOT NULL,
  `valor_total` double(10,2) NOT NULL,
  `cod_facturaco` int(10) NOT NULL,
  PRIMARY KEY (`cod_detallefaco`),
  KEY `detallefaco_idx` (`cod_facturaco`),
  CONSTRAINT `facturacodigo` FOREIGN KEY (`cod_facturaco`) REFERENCES `facturasco` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_facturaco`
--

LOCK TABLES `detalle_facturaco` WRITE;
/*!40000 ALTER TABLE `detalle_facturaco` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_facturaco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_facturave`
--

DROP TABLE IF EXISTS `detalle_facturave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_facturave` (
  `cod_detallefave` int(20) NOT NULL AUTO_INCREMENT,
  `cantidad_detalle` int(5) DEFAULT NULL,
  `cod_producto` int(3) DEFAULT NULL,
  `producto_detalle` varchar(25) DEFAULT NULL,
  `valor_unitario` double(10,2) DEFAULT NULL,
  `valor_total` double(10,2) DEFAULT NULL,
  `cod_facturave` int(10) DEFAULT NULL,
  PRIMARY KEY (`cod_detallefave`),
  KEY `productodefave` (`cod_producto`),
  KEY `facturave` (`cod_facturave`),
  CONSTRAINT `facturave` FOREIGN KEY (`cod_facturave`) REFERENCES `facturasve` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `productodefave` FOREIGN KEY (`cod_producto`) REFERENCES `productos` (`cod_producto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_facturave`
--

LOCK TABLES `detalle_facturave` WRITE;
/*!40000 ALTER TABLE `detalle_facturave` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_facturave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_rol`
--

DROP TABLE IF EXISTS `detalle_rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_rol` (
  `codigo_det` int(11) NOT NULL AUTO_INCREMENT,
  `numero_rol` int(3) DEFAULT NULL,
  `empleado_rol` varchar(45) DEFAULT NULL,
  `codigo_emprol` varchar(10) DEFAULT NULL,
  `sueldo` double DEFAULT NULL,
  `freserva` double DEFAULT NULL,
  `hextras` int(3) DEFAULT NULL,
  `vextras` double DEFAULT NULL,
  `hsuplementarias` int(3) DEFAULT NULL,
  `vsuplementarias` double DEFAULT NULL,
  `bono` double DEFAULT NULL,
  `tingresos` double DEFAULT NULL,
  `aiess` double DEFAULT NULL,
  `anticipos` double DEFAULT NULL,
  `multas` double DEFAULT NULL,
  `retenciones` double DEFAULT NULL,
  `otros` double DEFAULT NULL,
  `irenta` double DEFAULT NULL,
  `tegresos` double DEFAULT NULL,
  `nrecibir` double DEFAULT NULL,
  `ccorrientes` varchar(20) DEFAULT NULL,
  `ncheques` varchar(20) DEFAULT NULL,
  `codigo_rol` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo_det`),
  KEY `empleadorol_idx` (`codigo_emprol`),
  KEY `codrol_idx` (`codigo_rol`),
  CONSTRAINT `codrol` FOREIGN KEY (`codigo_rol`) REFERENCES `roles` (`codigo_rol`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `empleadorol` FOREIGN KEY (`codigo_emprol`) REFERENCES `empleados` (`cedula_empleado`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_rol`
--

LOCK TABLES `detalle_rol` WRITE;
/*!40000 ALTER TABLE `detalle_rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `cedula_empleado` varchar(10) NOT NULL,
  `nombres_empleado` varchar(25) NOT NULL,
  `apellidos_empleado` varchar(25) NOT NULL,
  `direccion_empleado` varchar(45) NOT NULL,
  `telefono_empleado` varchar(7) DEFAULT NULL,
  `ciudad_empleado` int(4) DEFAULT NULL,
  `movil_empleado` varchar(10) DEFAULT NULL,
  `estado_empleado` tinyint(4) NOT NULL,
  `email_empleado` varchar(45) DEFAULT NULL,
  `sueldo_empleado` double(10,2) DEFAULT NULL,
  `cod_departamento` int(2) DEFAULT NULL,
  `cod_cargo` int(2) DEFAULT NULL,
  `horali` time DEFAULT NULL,
  `horalf` time DEFAULT NULL,
  PRIMARY KEY (`cedula_empleado`),
  KEY `ciuedademple` (`ciudad_empleado`),
  KEY `coddep_idx` (`cod_departamento`),
  KEY `codcargo_idx` (`cod_cargo`),
  CONSTRAINT `ciuedademple` FOREIGN KEY (`ciudad_empleado`) REFERENCES `ciudades` (`cod_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `codcargo` FOREIGN KEY (`cod_cargo`) REFERENCES `cargos` (`cod_cargo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `coddep` FOREIGN KEY (`cod_departamento`) REFERENCES `departamentos` (`cod_dep`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `cod_empresa` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_empresa` varchar(25) NOT NULL,
  `direccion_empresa` varchar(45) NOT NULL,
  `ciudad_empresa` int(4) NOT NULL,
  `telefono_empresa` varchar(7) NOT NULL,
  `email_empresa` varchar(45) NOT NULL,
  `codigoms_empresa` varchar(7) DEFAULT NULL,
  `autorizacionsri_empresa` varchar(13) DEFAULT NULL,
  `facturacioni_empresa` int(9) DEFAULT NULL,
  `facturacionf_empresa` int(9) DEFAULT NULL,
  `fechacaducidadf_empresa` date DEFAULT NULL,
  `encargado_empresa` varchar(45) DEFAULT NULL,
  `ruc_empresa` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`cod_empresa`),
  KEY `ciudadempre_idx` (`ciudad_empresa`),
  CONSTRAINT `ciudadempre` FOREIGN KEY (`ciudad_empresa`) REFERENCES `ciudades` (`cod_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturasco`
--

DROP TABLE IF EXISTS `facturasco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturasco` (
  `cod_facturaco` varchar(7) NOT NULL,
  `numero_facturaco` varchar(9) NOT NULL,
  `ruc_proveedor` varchar(13) NOT NULL,
  `fecha_emision` date NOT NULL,
  `observacion_facturaco` varchar(100) NOT NULL,
  `subtotal_facturaco` double(10,2) NOT NULL,
  `iva_facturaco` double(10,2) NOT NULL,
  `descuento_facturaco` double(10,2) NOT NULL,
  `total_facturaco` double(10,2) NOT NULL,
  `estado_facturaco` tinyint(1) NOT NULL,
  `codigo_fact` int(10) NOT NULL AUTO_INCREMENT,
  `termino_pago` int(2) DEFAULT NULL,
  PRIMARY KEY (`codigo_fact`),
  KEY `proveedorfacturaco_idx` (`ruc_proveedor`),
  KEY `terminocod_idx` (`termino_pago`),
  CONSTRAINT `proveedorfacturaco` FOREIGN KEY (`ruc_proveedor`) REFERENCES `proveedores` (`ruc_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturasco`
--

LOCK TABLES `facturasco` WRITE;
/*!40000 ALTER TABLE `facturasco` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturasco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturasve`
--

DROP TABLE IF EXISTS `facturasve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturasve` (
  `cod_facturave` varchar(7) NOT NULL,
  `numero_facturave` varchar(9) NOT NULL,
  `numero_cliente` varchar(10) NOT NULL,
  `fecha_emision` date NOT NULL,
  `observacion_facturave` varchar(100) NOT NULL,
  `subtotal_facturave` double(10,2) NOT NULL,
  `iva_facturave` double(10,2) NOT NULL,
  `descuento_facturave` double(10,2) NOT NULL,
  `total_facturave` double(10,2) NOT NULL,
  `estado_facturave` tinyint(1) NOT NULL,
  `codigo_fact` int(10) NOT NULL AUTO_INCREMENT,
  `termino_pago` int(2) DEFAULT NULL,
  PRIMARY KEY (`codigo_fact`),
  KEY `clientefave` (`numero_cliente`),
  CONSTRAINT `clientefave` FOREIGN KEY (`numero_cliente`) REFERENCES `clientes` (`cedula_cliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturasve`
--

LOCK TABLES `facturasve` WRITE;
/*!40000 ALTER TABLE `facturasve` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturasve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paises` (
  `cod_pais` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_pais` varchar(25) NOT NULL,
  `estado_pais` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_pais`),
  UNIQUE KEY `nombre_pais_UNIQUE` (`nombre_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parametros`
--

DROP TABLE IF EXISTS `parametros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parametros` (
  `cod_parametro` int(4) NOT NULL AUTO_INCREMENT,
  `iva` varchar(5) DEFAULT NULL,
  `iess` varchar(5) DEFAULT NULL,
  `decimotercero` varchar(5) DEFAULT NULL,
  `decimocuarto` varchar(5) DEFAULT NULL,
  `sueldobasico` varchar(5) DEFAULT NULL,
  `fondo_reserva` varchar(5) DEFAULT NULL,
  `bonos` varchar(5) DEFAULT NULL,
  `impuesto_renta` varchar(5) DEFAULT NULL,
  `hora_cierre` time DEFAULT NULL,
  `iesspersonal` varchar(5) DEFAULT NULL,
  `hora_ingreso` time DEFAULT NULL,
  `hora_salida` time DEFAULT NULL,
  PRIMARY KEY (`cod_parametro`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parametros`
--

LOCK TABLES `parametros` WRITE;
/*!40000 ALTER TABLE `parametros` DISABLE KEYS */;
/*!40000 ALTER TABLE `parametros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pcontabiidad`
--

DROP TABLE IF EXISTS `pcontabiidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pcontabiidad` (
  `cod_pcontabiidad` int(11) NOT NULL AUTO_INCREMENT,
  `nom_pcontabiidad` varchar(45) NOT NULL,
  `estado_pcontabilidad` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_pcontabiidad`),
  UNIQUE KEY `nom_pcontabiidad_UNIQUE` (`nom_pcontabiidad`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pcontabiidad`
--

LOCK TABLES `pcontabiidad` WRITE;
/*!40000 ALTER TABLE `pcontabiidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `pcontabiidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilegios`
--

DROP TABLE IF EXISTS `privilegios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privilegios` (
  `codigo_usuario` varchar(10) NOT NULL,
  `nombre_usuario` varchar(15) NOT NULL,
  `facturacion` tinyint(1) DEFAULT NULL,
  `iventarios` tinyint(1) DEFAULT NULL,
  `clipro` tinyint(1) DEFAULT NULL,
  `parametros` tinyint(1) DEFAULT NULL,
  `cuentasxcobrar` tinyint(1) DEFAULT NULL,
  `cuentasxpagar` tinyint(1) DEFAULT NULL,
  `contabilidad` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`codigo_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilegios`
--

LOCK TABLES `privilegios` WRITE;
/*!40000 ALTER TABLE `privilegios` DISABLE KEYS */;
INSERT INTO `privilegios` VALUES ('0000000000','root',1,1,1,1,1,1,1);
/*!40000 ALTER TABLE `privilegios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `cod_producto` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(25) NOT NULL,
  `unidad_productoc` int(2) DEFAULT NULL,
  `cantidadi_producto` int(4) DEFAULT NULL,
  `cantidadmi_producto` int(3) DEFAULT NULL,
  `cantidadma_producto` int(11) DEFAULT NULL,
  `proveedor_producto` varchar(13) DEFAULT NULL,
  `subcategoria_producto` int(3) DEFAULT NULL,
  `bodega_producto` int(2) DEFAULT NULL,
  `unidad_productov` int(2) DEFAULT NULL,
  `cantidadauni_producto` int(4) DEFAULT NULL,
  `precio_producto` double(10,2) DEFAULT NULL,
  `estado_producto` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_producto`),
  UNIQUE KEY `nombre_producto_UNIQUE` (`nombre_producto`),
  KEY `proveedorpro` (`proveedor_producto`),
  KEY `subcategoriapro` (`subcategoria_producto`),
  KEY `bodegapro` (`bodega_producto`),
  KEY `unidadpro` (`unidad_productov`),
  CONSTRAINT `bodegapro` FOREIGN KEY (`bodega_producto`) REFERENCES `bodega` (`cod_bodega`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `proveedorpro` FOREIGN KEY (`proveedor_producto`) REFERENCES `proveedores` (`ruc_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `subcategoriapro` FOREIGN KEY (`subcategoria_producto`) REFERENCES `subcategoria` (`cod_subcategoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `unidadpro` FOREIGN KEY (`unidad_productov`) REFERENCES `unidades` (`cod_unidad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `ruc_proveedor` varchar(13) NOT NULL,
  `nombre_eproveedor` varchar(30) DEFAULT NULL,
  `nombres_proveedor` varchar(20) NOT NULL,
  `apellidos_proveedor` varchar(20) NOT NULL,
  `direccion_proveedor` varchar(45) NOT NULL,
  `ciudad_proveedir` int(4) NOT NULL,
  `telefono_proveedor` varchar(7) DEFAULT NULL,
  `email_proveedor` varchar(30) DEFAULT NULL,
  `codigofms_proveedor` varchar(7) DEFAULT NULL,
  `autorizacionsri_proveedor` varchar(13) DEFAULT NULL,
  `iniciof_proveedor` int(9) DEFAULT NULL,
  `finalizacionf_proveedor` int(9) DEFAULT NULL,
  `fechacf_proveedor` date DEFAULT NULL,
  `estado_proveedor` tinyint(4) NOT NULL,
  PRIMARY KEY (`ruc_proveedor`),
  KEY `ciudadprove_idx` (`ciudad_proveedir`),
  CONSTRAINT `ciudadprove` FOREIGN KEY (`ciudad_proveedir`) REFERENCES `ciudades` (`cod_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provincias`
--

DROP TABLE IF EXISTS `provincias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provincias` (
  `cod_provincia` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_provincia` varchar(20) NOT NULL,
  `cod_pais` int(2) DEFAULT NULL,
  `estado_provincia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cod_provincia`),
  UNIQUE KEY `nombre_provincia_UNIQUE` (`nombre_provincia`),
  KEY `provinciapa` (`cod_pais`),
  CONSTRAINT `provinciapa` FOREIGN KEY (`cod_pais`) REFERENCES `paises` (`cod_pais`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincias`
--

LOCK TABLES `provincias` WRITE;
/*!40000 ALTER TABLE `provincias` DISABLE KEYS */;
/*!40000 ALTER TABLE `provincias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibos`
--

DROP TABLE IF EXISTS `recibos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibos` (
  `cod_recibo` int(10) NOT NULL,
  `fecha_emitido` date DEFAULT NULL,
  `doc_cliente` varchar(10) DEFAULT NULL,
  `observaciones` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `monto` varchar(13) DEFAULT NULL,
  `pagoen` varchar(20) DEFAULT NULL,
  `estado_recibo` tinyint(1) DEFAULT NULL,
  `tipo_recibo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_recibo`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibos`
--

LOCK TABLES `recibos` WRITE;
/*!40000 ALTER TABLE `recibos` DISABLE KEYS */;
/*!40000 ALTER TABLE `recibos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `codigo_rol` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_rol` date DEFAULT NULL,
  `periodo_rol` varchar(45) DEFAULT NULL,
  `contador_rol` varchar(10) DEFAULT NULL,
  `autorizacion_rol` varchar(10) DEFAULT NULL,
  `estado_rol` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`codigo_rol`),
  KEY `empleadorolc_idx` (`contador_rol`),
  CONSTRAINT `empleadorolc` FOREIGN KEY (`contador_rol`) REFERENCES `empleados` (`cedula_empleado`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcategoria`
--

DROP TABLE IF EXISTS `subcategoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcategoria` (
  `cod_subcategoria` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_subcategoria` varchar(25) NOT NULL,
  `cod_categoria` int(2) DEFAULT NULL,
  `estado_subcategoria` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_subcategoria`),
  UNIQUE KEY `nombre_subcategoria_UNIQUE` (`nombre_subcategoria`),
  KEY `codcategoria_idx` (`cod_categoria`),
  CONSTRAINT `codcategoria` FOREIGN KEY (`cod_categoria`) REFERENCES `categorias` (`cod_categoria`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcategoria`
--

LOCK TABLES `subcategoria` WRITE;
/*!40000 ALTER TABLE `subcategoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcategoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcuenta1`
--

DROP TABLE IF EXISTS `subcuenta1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcuenta1` (
  `cod_subcuenta1` varchar(10) NOT NULL,
  `nombre_subcuenta1` varchar(75) DEFAULT NULL,
  `cod_subcuenta` varchar(10) DEFAULT NULL,
  `estado_subcuenta1` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_subcuenta1`),
  KEY `subcuentas_idx` (`cod_subcuenta`),
  CONSTRAINT `subcuentas` FOREIGN KEY (`cod_subcuenta`) REFERENCES `subcuentas` (`cod_subcuenta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcuenta1`
--

LOCK TABLES `subcuenta1` WRITE;
/*!40000 ALTER TABLE `subcuenta1` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcuenta1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcuenta2`
--

DROP TABLE IF EXISTS `subcuenta2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcuenta2` (
  `cod_subcuenta2` varchar(10) NOT NULL,
  `nombre_subcuenta2` varchar(75) DEFAULT NULL,
  `cod_subcuenta1` varchar(10) DEFAULT NULL,
  `estado_subcuenta2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_subcuenta2`),
  KEY `subcuenta1_idx` (`cod_subcuenta1`),
  CONSTRAINT `subcuenta1` FOREIGN KEY (`cod_subcuenta1`) REFERENCES `subcuenta1` (`cod_subcuenta1`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcuenta2`
--

LOCK TABLES `subcuenta2` WRITE;
/*!40000 ALTER TABLE `subcuenta2` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcuenta2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcuenta3`
--

DROP TABLE IF EXISTS `subcuenta3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcuenta3` (
  `cod_subcuenta3` varchar(10) NOT NULL,
  `nombre_subcuenta3` varchar(75) DEFAULT NULL,
  `cod_subcuenta2` varchar(10) DEFAULT NULL,
  `estado_subcuenta3` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_subcuenta3`),
  KEY `subcuenta2_idx` (`cod_subcuenta2`),
  CONSTRAINT `subcuenta2` FOREIGN KEY (`cod_subcuenta2`) REFERENCES `subcuenta2` (`cod_subcuenta2`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcuenta3`
--

LOCK TABLES `subcuenta3` WRITE;
/*!40000 ALTER TABLE `subcuenta3` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcuenta3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcuentas`
--

DROP TABLE IF EXISTS `subcuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcuentas` (
  `cod_subcuenta` varchar(10) NOT NULL,
  `nombre_subcuenta` varchar(75) NOT NULL,
  `cod_cuenta` int(2) NOT NULL,
  `estado_subcuenta` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_subcuenta`),
  KEY `cod_cuenta1_idx` (`cod_cuenta`),
  CONSTRAINT `cod_cuenta1` FOREIGN KEY (`cod_cuenta`) REFERENCES `cuentas` (`cod_cuenta`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcuentas`
--

LOCK TABLES `subcuentas` WRITE;
/*!40000 ALTER TABLE `subcuentas` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminos_pagos`
--

DROP TABLE IF EXISTS `terminos_pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `terminos_pagos` (
  `cod_pago` int(2) NOT NULL AUTO_INCREMENT,
  `descripcion_termino` varchar(45) NOT NULL,
  `nombre_termino` varchar(45) DEFAULT NULL,
  `pago_inicial` int(3) DEFAULT NULL,
  `pago_dias` int(5) DEFAULT NULL,
  `numero_cuotas` int(5) DEFAULT NULL,
  `tasa_nominal` int(3) DEFAULT NULL,
  `estado_termino` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_pago`),
  UNIQUE KEY `descripcion_termino_UNIQUE` (`descripcion_termino`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminos_pagos`
--

LOCK TABLES `terminos_pagos` WRITE;
/*!40000 ALTER TABLE `terminos_pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `terminos_pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `codigo_tipousuario` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_tipousuario` varchar(25) NOT NULL,
  `estado_tipousuario` tinyint(1) NOT NULL,
  PRIMARY KEY (`codigo_tipousuario`),
  UNIQUE KEY `nombre_tipousuario_UNIQUE` (`nombre_tipousuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transacciones`
--

DROP TABLE IF EXISTS `transacciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transacciones` (
  `cod_trans` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_trans` date DEFAULT NULL,
  `cod_cuenta` varchar(20) DEFAULT NULL,
  `des_cuenta` varchar(45) DEFAULT NULL,
  `debe` double(10,2) DEFAULT '0.00',
  `haber` double(10,2) DEFAULT '0.00',
  `facturaco` int(9) DEFAULT NULL,
  `facturave` int(9) DEFAULT NULL,
  `transmanu` varchar(9) DEFAULT NULL,
  `reciboco` varchar(9) DEFAULT NULL,
  `recibove` varchar(9) DEFAULT NULL,
  `roles` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`cod_trans`),
  KEY `facturacotra` (`facturaco`),
  KEY `facturavetra` (`facturave`),
  CONSTRAINT `facturacotra` FOREIGN KEY (`facturaco`) REFERENCES `facturasco` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `facturavetra` FOREIGN KEY (`facturave`) REFERENCES `facturasve` (`codigo_fact`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transacciones`
--

LOCK TABLES `transacciones` WRITE;
/*!40000 ALTER TABLE `transacciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `transacciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidades`
--

DROP TABLE IF EXISTS `unidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unidades` (
  `cod_unidad` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_unidad` varchar(20) NOT NULL,
  `estado_unidad` tinyint(1) NOT NULL,
  PRIMARY KEY (`cod_unidad`),
  UNIQUE KEY `nombre_unidad_UNIQUE` (`nombre_unidad`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidades`
--

LOCK TABLES `unidades` WRITE;
/*!40000 ALTER TABLE `unidades` DISABLE KEYS */;
/*!40000 ALTER TABLE `unidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'alexanderflower'
--

--
-- Dumping routines for database 'alexanderflower'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-27 12:46:06
