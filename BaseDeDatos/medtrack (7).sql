-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-11-2025 a las 05:57:04
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `medtrack`
--
CREATE DATABASE IF NOT EXISTS `medtrack` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `medtrack`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `antecedente_registro`
--

DROP TABLE IF EXISTS `antecedente_registro`;
CREATE TABLE IF NOT EXISTS `antecedente_registro` (
  `id_registro` int(11) NOT NULL AUTO_INCREMENT,
  `id_historial` int(11) NOT NULL,
  `id_condicion` int(11) NOT NULL,
  `presente` tinyint(1) DEFAULT 0,
  `detalle` text DEFAULT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_registro`),
  UNIQUE KEY `uk_historial_condicion` (`id_historial`,`id_condicion`),
  KEY `id_condicion` (`id_condicion`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `antecedente_registro`
--

INSERT INTO `antecedente_registro` (`id_registro`, `id_historial`, `id_condicion`, `presente`, `detalle`, `fecha_registro`) VALUES
(1, 1, 11, 1, 'Controlada con medicación', '2025-11-19 02:51:14'),
(2, 1, 28, 1, '10 cigarrillos diarios', '2025-11-19 02:51:14'),
(3, 2, 3, 1, 'Antecedente familiar de infarto', '2025-11-19 02:51:14'),
(4, 3, 10, 1, 'Desde la infancia', '2025-11-19 02:51:14'),
(5, 4, 9, 1, 'Diabetes tipo 2 diagnosticada hace 5 años', '2025-11-19 02:51:14'),
(6, 5, 11, 1, 'Tratamiento con enalapril', '2025-11-19 02:51:14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo_antecedente`
--

DROP TABLE IF EXISTS `catalogo_antecedente`;
CREATE TABLE IF NOT EXISTS `catalogo_antecedente` (
  `id_condicion` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_condicion`),
  UNIQUE KEY `uk_tipo_nombre` (`id_tipo`,`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `catalogo_antecedente`
--

INSERT INTO `catalogo_antecedente` (`id_condicion`, `id_tipo`, `nombre`, `codigo`) VALUES
(1, 1, 'Diabetes', 'HER_DIAB'),
(2, 1, 'Hipertension', 'HER_HIP'),
(3, 1, 'Cardiopatias', 'HER_CARD'),
(4, 1, 'Neurologicos', 'HER_NEU'),
(5, 1, 'Oncologicos', 'HER_ONC'),
(6, 1, 'Hematologicos', 'HER_HEM'),
(7, 1, 'Psiquiatricos', 'HER_PSI'),
(8, 1, 'Otros', 'HER_OTR'),
(9, 2, 'Diabetes', 'PER_DIAB'),
(10, 2, 'Asma', 'PER_ASMA'),
(11, 2, 'Hipertension', 'PER_HIP'),
(12, 2, 'Cardiopatias', 'PER_CARD'),
(13, 2, 'Hernias', 'PER_HERN'),
(14, 2, 'Problemas_oftalmologicos', 'PER_OFT'),
(15, 2, 'Problemas_oidos', 'PER_OIDO'),
(16, 2, 'Obstruccion_nasal', 'PER_NAS'),
(17, 2, 'Problemas_piel', 'PER_PIEL'),
(18, 2, 'Desmayos', 'PER_DESM'),
(19, 2, 'Dolor_cabeza', 'PER_DOLCAB'),
(20, 2, 'Lesiones_columna', 'PER_LESCOL'),
(21, 2, 'Amputaciones', 'PER_AMPU'),
(22, 2, 'Infecciones_urinarias', 'PER_INFUR'),
(23, 2, 'Fracturas', 'PER_FRACT'),
(24, 2, 'Cirugias', 'PER_CIRU'),
(25, 2, 'ETS', 'PER_ETS'),
(26, 2, 'Trastornos_mentales', 'PER_TRASTM'),
(27, 2, 'Toxicomanias', 'PER_TOX'),
(28, 2, 'Tabaquismo', 'PER_TAB'),
(29, 2, 'Alcoholismo', 'PER_ALC'),
(30, 3, 'Alteracion_vista', 'UA_VISTA'),
(31, 3, 'Dificultad_respirar', 'UA_RESP'),
(32, 3, 'Problemas_audicion', 'UA_OIDO'),
(33, 3, 'Dolor_presion_pecho', 'UA_PECHO'),
(34, 3, 'Perdida_peso', 'UA_PESO'),
(35, 3, 'Transfusiones', 'UA_TRANS'),
(36, 3, 'Cirugias', 'UA_CIRU'),
(37, 3, 'Diarrea_estrenimiento', 'UA_DIG'),
(38, 3, 'Orina_rojiza', 'UA_ORINA'),
(39, 3, 'Heces_negro', 'UA_HECES'),
(40, 3, 'Lumbalgia', 'UA_LUM'),
(41, 3, 'Preocupaciones_depresion', 'UA_DEP'),
(42, 3, 'Otros', 'UA_OTR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

DROP TABLE IF EXISTS `cita`;
CREATE TABLE IF NOT EXISTS `cita` (
  `id_cita` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `fecha_hora` datetime NOT NULL,
  `estado` enum('Programada','Completada','Cancelada','No asistió') DEFAULT 'Programada',
  `motivo` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_cita`),
  KEY `id_paciente` (`id_paciente`),
  KEY `id_empleado` (`id_empleado`),
  KEY `idx_cita_fecha` (`fecha_hora`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`id_cita`, `id_paciente`, `id_empleado`, `fecha_hora`, `estado`, `motivo`, `created_at`) VALUES
(1, 1, 2, '2025-11-18 18:50:15', 'Programada', 'Consulta general', '2025-11-19 00:50:15'),
(2, 2, 2, '2025-11-18 19:50:15', 'Programada', 'Dolor de cabeza', '2025-11-19 00:50:15'),
(3, 3, 2, '2025-11-18 20:50:15', 'Completada', 'Revisión anual', '2025-11-19 00:50:15'),
(4, 4, 4, '2025-11-20 09:00:00', 'Programada', 'Consulta por dolor abdominal', '2025-11-19 02:51:14'),
(5, 5, 5, '2025-11-20 10:30:00', 'Programada', 'Revisión cardíaca anual', '2025-11-19 02:51:14'),
(6, 6, 7, '2025-11-20 11:15:00', 'Programada', 'Control pediátrico', '2025-11-19 02:51:14'),
(7, 7, 8, '2025-11-20 14:00:00', 'Programada', 'Consulta ginecológica', '2025-11-19 02:51:14'),
(8, 8, 1, '2025-11-20 18:30:00', 'Programada', 'Dolor de cabeza persistente', '2025-11-19 02:51:14'),
(9, 9, 5, '2025-11-19 09:00:00', 'Cancelada', 'Chequeo general', '2025-11-19 02:51:14'),
(10, 10, 7, '2025-11-19 10:30:00', 'Completada', 'Control de vacunación', '2025-11-19 02:51:14'),
(11, 1, 8, '2025-11-19 11:15:00', 'Completada', 'Consulta ginecológica', '2025-11-19 02:51:14'),
(12, 2, 4, '2025-11-19 14:00:00', 'Completada', 'Dolor muscular', '2025-11-19 02:51:14'),
(13, 3, 5, '2025-11-18 09:00:00', 'Completada', 'Revisión cardíaca', '2025-11-19 02:51:14'),
(14, 4, 7, '2025-11-18 10:30:00', 'Cancelada', 'Consulta pediátrica - Paciente enfermo', '2025-11-19 02:51:14'),
(15, 5, 8, '2025-11-18 11:15:00', 'Cancelada', 'Control ginecológico - Reprogramar', '2025-11-19 02:51:14'),
(16, 6, 4, '2025-11-17 09:00:00', 'No asistió', 'Chequeo anual', '2025-11-19 02:51:14'),
(17, 7, 5, '2025-11-17 10:30:00', 'No asistió', 'Consulta por tos', '2025-11-19 02:51:14'),
(18, 8, 7, '2025-11-16 09:00:00', 'Completada', 'Control de presión arterial', '2025-11-19 02:51:14'),
(19, 9, 8, '2025-11-16 10:30:00', 'Completada', 'Revisión de resultados', '2025-11-19 02:51:14'),
(20, 10, 4, '2025-11-15 09:00:00', 'Cancelada', 'Consulta por alergias', '2025-11-19 02:51:14'),
(21, 3, 1, '2025-11-18 21:16:35', 'Completada', '', '2025-11-19 03:16:35'),
(22, 6, 1, '2025-11-20 16:00:00', 'Cancelada', 'chequeo general', '2025-11-19 03:23:21'),
(23, 11, 1, '2025-11-21 20:00:00', 'Programada', 'Chequeo General', '2025-11-19 03:55:56'),
(24, 11, 1, '2025-11-18 22:03:24', 'Completada', 'dolor de cabeza', '2025-11-19 04:03:24');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--

DROP TABLE IF EXISTS `consulta`;
CREATE TABLE IF NOT EXISTS `consulta` (
  `id_consulta` int(11) NOT NULL AUTO_INCREMENT,
  `id_cita` int(11) NOT NULL,
  `fecha_registro` datetime DEFAULT current_timestamp(),
  `motivo` text DEFAULT NULL,
  `sintomas` text DEFAULT NULL,
  `signos_vitales` text DEFAULT NULL,
  `exploracion_fisica` text DEFAULT NULL,
  `diagnostico` text DEFAULT NULL,
  `indicaciones_medicas` text DEFAULT NULL,
  `restricciones_medicas` text DEFAULT NULL,
  `medicacion_prescrita` text DEFAULT NULL,
  `pronostico` text DEFAULT NULL,
  `id_medico` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_consulta`),
  KEY `id_cita` (`id_cita`),
  KEY `id_medico` (`id_medico`),
  KEY `idx_consulta_fecha` (`fecha_registro`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `consulta`
--

INSERT INTO `consulta` (`id_consulta`, `id_cita`, `fecha_registro`, `motivo`, `sintomas`, `signos_vitales`, `exploracion_fisica`, `diagnostico`, `indicaciones_medicas`, `restricciones_medicas`, `medicacion_prescrita`, `pronostico`, `id_medico`) VALUES
(1, 3, '2025-11-18 18:50:15', NULL, NULL, NULL, NULL, 'Paciente en buen estado de salud', NULL, NULL, NULL, NULL, 2),
(2, 4, '2025-11-19 09:00:00', 'Chequeo general', 'Cansancio, mareos ocasionales', 'TA: 120/80, FC: 72, Temp: 36.5°C', 'Paciente en buen estado general', 'Estado de salud satisfactorio', 'Descansar 8 horas, ejercicio moderado', 'Ninguna', 'Multivitamínico 1 tableta diaria', 'Favorable', 5),
(3, 5, '2025-11-19 10:30:00', 'Control de vacunación', 'Ninguno - control preventivo', 'TA: 110/70, FC: 68, Temp: 36.8°C', 'Paciente saludable', 'Paciente sano', 'Aplicación vacuna influenza', 'Ninguna', 'Vacuna influenza', 'Excelente', 7),
(4, 6, '2025-11-19 11:15:00', 'Consulta ginecológica', 'Dolor abdominal bajo', 'TA: 118/78, FC: 75, Temp: 36.7°C', 'Abdomen blando, dolor a la palpación', 'Dismenorrea primaria', 'Aplicar calor local, reposo', 'Evitar ejercicio intenso durante menstruación', 'Ibuprofeno 400mg cada 8 horas si dolor', 'Favorable', 8),
(5, 7, '2025-11-19 14:00:00', 'Dolor muscular', 'Dolor en espalda baja después de ejercicio', 'TA: 125/82, FC: 78, Temp: 36.9°C', 'Contractura muscular lumbar', 'Lumbalgia mecánica', 'Fisioterapia, ejercicios de estiramiento', 'Evitar cargar peso por 1 semana', 'Relajante muscular 1 tableta cada 12 horas', 'Mejora en 5-7 días', 4),
(6, 8, '2025-11-18 09:00:00', 'Revisión cardíaca', 'Palpitaciones ocasionales', 'TA: 130/85, FC: 82, Temp: 36.6°C', 'Ritmo cardíaco regular, sin soplos', 'Arritmia sinusal benigna', 'Reducir consumo de cafeína', 'Evitar estimulantes', 'Ninguna', 'Favorable', 5),
(7, 9, '2025-11-16 09:00:00', 'Control de presión arterial', 'Ninguno - control rutinario', 'TA: 135/88, FC: 76, Temp: 36.5°C', 'Paciente estable', 'Hipertensión grado 1 controlada', 'Continuar medicación, dieta baja en sal', 'Restricción de sodio', 'Enalapril 10mg 1 tableta diaria', 'Buen control', 7),
(8, 10, '2025-11-16 10:30:00', 'Revisión de resultados', 'Ninguno - revisión de laboratorio', 'TA: 118/76, FC: 72, Temp: 36.4°C', 'Paciente asintomático', 'Perfil lipídico dentro de límites normales', 'Continuar dieta y ejercicio', 'Mantener estilo de vida saludable', 'Ninguna', 'Excelente', 8),
(9, 11, '2025-11-15 09:00:00', 'Consulta por alergias', 'Estornudos, congestión nasal', 'TA: 122/78, FC: 74, Temp: 36.8°C', 'Mucosas nasales congestivas', 'Rinitis alérgica estacional', 'Evitar alérgenos conocidos', 'Ninguna', 'Loratadina 10mg 1 tableta diaria', 'Mejora con tratamiento', 4),
(10, 12, '2025-11-14 10:00:00', 'Dolor de garganta', 'Dolor al tragar, fiebre', 'TA: 125/80, FC: 85, Temp: 38.2°C', 'Faringe eritematosa', 'Faringitis aguda', 'Gárgaras con agua salada, reposo', 'Evitar alimentos irritantes', 'Amoxicilina 500mg cada 8 horas por 7 días', 'Resolución en 5-7 días', 5),
(11, 13, '2025-11-13 11:00:00', 'Control diabetes', 'Ninguno - control rutinario', 'TA: 128/82, FC: 78, Temp: 36.6°C', 'Paciente estable', 'Diabetes tipo 2 controlada', 'Continuar monitoreo glucosa', 'Dieta controlada en carbohidratos', 'Metformina 850mg 2 veces al día', 'Estable', 7),
(12, 14, '2025-11-12 14:00:00', 'Lesión deportiva', 'Dolor en rodilla derecha', 'TA: 120/78, FC: 76, Temp: 36.7°C', 'Edema leve en rodilla derecha', 'Esguince grado 1 rodilla derecha', 'Reposo, hielo, compresión, elevación', 'Evitar deportes por 2 semanas', 'Antiinflamatorio 1 tableta cada 12 horas', 'Mejora en 10-14 días', 8),
(13, 15, '2025-11-11 09:00:00', 'Consulta prenatal', 'Náuseas matutinas', 'TA: 118/75, FC: 82, Temp: 36.9°C', 'Útero aumentado de tamaño', 'Embarazo de 12 semanas', 'Suplementos prenatales, alimentación balanceada', 'Evitar alimentos crudos', 'Ácido fólico 400mcg diario', 'Evolución favorable', 4),
(14, 16, '2025-11-10 10:30:00', 'Control asma', 'Tos nocturna', 'TA: 122/80, FC: 84, Temp: 36.5°C', 'Murmullo vesicular conservado', 'Asma bronquial controlada', 'Uso de inhalador de rescate según necesidad', 'Evitar desencadenantes', 'Salbutamol inhalador según necesidad', 'Buen control', 5),
(15, 17, '2025-11-09 11:15:00', 'Dermatitis', 'Erupción cutánea en brazos', 'TA: 118/76, FC: 72, Temp: 36.8°C', 'Eritema y pápulas en antebrazos', 'Dermatitis de contacto', 'Evitar agente causal identificado', 'Usar jabones neutros', 'Crema de hidrocortisona 2 veces al día', 'Mejora en 7 días', 7),
(16, 18, '2025-11-08 14:00:00', 'Control postoperatorio', 'Dolor en sitio quirúrgico', 'TA: 124/82, FC: 78, Temp: 37.1°C', 'Herida quirúrgica limpia', 'Postoperatorio apendicectomía sin complicaciones', 'Cuidados de herida, reposo relativo', 'Evitar esfuerzos por 4 semanas', 'Analgésico según dolor', 'Evolución satisfactoria', 8),
(17, 19, '2025-11-07 09:00:00', 'Migraña', 'Dolor de cabeza intenso', 'TA: 130/85, FC: 80, Temp: 36.7°C', 'Paciente con fotofobia', 'Migraña con aura', 'Reposo en lugar oscuro y silencioso', 'Evitar desencadenantes alimentarios', 'Sumatriptán 50mg al inicio del dolor', 'Controlable', 4),
(18, 20, '2025-11-06 10:30:00', 'Control tiroideo', 'Cansancio, aumento de peso', 'TA: 126/80, FC: 72, Temp: 36.6°C', 'Paciente eutímica', 'Hipotiroidismo subclínico', 'Continuar monitoreo', 'Ninguna', 'Levotiroxina 25mcg 1 tableta diaria', 'Estable', 5),
(19, 21, '2025-11-18 21:16:35', '', '', '{frecuencia_respiratoria=, oximetria=, peso=, estatura=, tension_arterial=, temperatura=, frecuencia_cardiaca=}', '{habitus_exterior=, craneo=, peea=, abdomen=, torax=, observaciones=, cuello=, genitales=, miembros=}', '', '', '', '', '', 1),
(20, 1, '2025-11-20 09:00:00', NULL, 'Ninguno', 'TA: 120/80, FC: 72', NULL, 'Control rutinario - paciente estable', NULL, NULL, NULL, NULL, 2),
(21, 2, '2025-11-20 10:30:00', NULL, 'Ninguno', 'TA: 118/76, FC: 70', NULL, 'Revisión general - parámetros normales', NULL, NULL, NULL, NULL, 4),
(22, 1, '2025-11-20 09:00:00', NULL, 'Ninguno', 'TA: 120/80, FC: 72', NULL, 'Control rutinario - paciente estable', NULL, NULL, NULL, NULL, 2),
(23, 2, '2025-11-20 10:30:00', NULL, 'Ninguno', 'TA: 118/76, FC: 70', NULL, 'Revisión general - parámetros normales', NULL, NULL, NULL, NULL, 4),
(24, 24, '2025-11-18 22:03:24', 'dolor de cabeza', '', '{frecuencia_respiratoria=, oximetria=, peso=, estatura=, tension_arterial=, temperatura=, frecuencia_cardiaca=}', '{habitus_exterior=, craneo=, peea=, abdomen=, torax=, observaciones=, cuello=, genitales=, miembros=}', '', '', '', '', '', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `id_empleado` int(11) NOT NULL AUTO_INCREMENT,
  `id_empresa` int(11) DEFAULT NULL,
  `nombres` varchar(150) NOT NULL,
  `apellido_paterno` varchar(150) DEFAULT NULL,
  `apellido_materno` varchar(150) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo_electronico` varchar(200) DEFAULT NULL,
  `curp` varchar(30) DEFAULT NULL,
  `rfc` varchar(30) DEFAULT NULL,
  `puesto` varchar(100) DEFAULT NULL,
  `sexo` enum('M','F','Otro') DEFAULT 'Otro',
  `horario` varchar(200) DEFAULT NULL,
  `cedula_profesional` varchar(50) DEFAULT NULL,
  `password_hash` varchar(255) DEFAULT NULL,
  `estado` enum('Activo','Inactivo') DEFAULT 'Activo',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_empleado`),
  UNIQUE KEY `correo_electronico` (`correo_electronico`),
  KEY `id_empresa` (`id_empresa`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`id_empleado`, `id_empresa`, `nombres`, `apellido_paterno`, `apellido_materno`, `fecha_nacimiento`, `telefono`, `correo_electronico`, `curp`, `rfc`, `puesto`, `sexo`, `horario`, `cedula_profesional`, `password_hash`, `estado`, `created_at`) VALUES
(1, 1, 'Admin', 'Sistema', 'Principal', NULL, NULL, 'admin@medtrack.com', NULL, NULL, 'Administrador', 'Otro', NULL, NULL, NULL, 'Activo', '2025-11-18 23:42:18'),
(2, 1, 'Ana', 'Rodríguez', 'Silva', NULL, '555-1002', 'ana.rodriguez@medtrack.com', NULL, NULL, 'Médico General', 'Otro', 'Lunes a Viernes 8:00-16:00', NULL, NULL, 'Activo', '2025-11-18 23:42:18'),
(3, 1, 'Pedro', 'Martínez', 'Castro', NULL, '555-1003', 'pedro.martinez@medtrack.com', NULL, NULL, 'Enfermero', 'Otro', 'Lunes a Viernes 7:00-15:00', NULL, NULL, 'Activo', '2025-11-18 23:42:18'),
(4, 1, 'Laura', 'Gutiérrez', 'Morales', '1985-03-15', '555-1002', 'laura.gutierrez@medtrack.com', 'GUML850315MDFTRR01', 'GUML850315K34', 'Medico', 'F', 'Matutino', '1234567', NULL, 'Activo', '2025-11-19 02:51:14'),
(5, 1, 'Ricardo', 'Fernández', 'Castro', '1978-07-22', '555-1003', 'ricardo.fernandez@medtrack.com', 'FECR780722HDFRSC02', 'FECR780722K35', 'Cardiólogo', 'M', 'L-V 9:00-17:00', '2345678', NULL, 'Inactivo', '2025-11-19 02:51:14'),
(6, 1, 'Sofia', 'Ramírez', 'Ortega', '1990-11-08', '555-1004', 'sofia.ramirez@medtrack.com', 'RAOS901108MDFMTR03', 'RAOS901108K36', 'Enfermera', 'F', 'L-S 7:00-15:00', NULL, NULL, 'Activo', '2025-11-19 02:51:14'),
(7, 1, 'Miguel', 'Torres', 'Santos', '1982-12-30', '555-1005', 'miguel.torres@medtrack.com', 'TOSM821230HDFRNG04', 'TOSM821230K37', 'Pediatra', 'M', 'L-V 10:00-18:00', '3456789', NULL, 'Activo', '2025-11-19 02:51:14'),
(8, 1, 'Elena', 'Vargas', 'Ríos', '1988-05-18', '555-1006', 'elena.vargas@medtrack.com', 'VARE880518MDFRSL05', 'VARE880518K38', 'Ginecóloga', 'F', 'L-V 8:00-16:00', '4567890', NULL, 'Inactivo', '2025-11-19 02:51:14'),
(9, 1, 'Javier', 'Mendoza', 'Luna', '1992-09-25', '555-1007', 'javier.mendoza@medtrack.com', 'MELJ920925HDFRNV06', 'MELJ920925K39', 'Enfermero', 'M', 'L-S 14:00-22:00', NULL, NULL, 'Activo', '2025-11-19 02:51:14'),
(10, 1, 'Carmen', 'Díaz', 'Flores', '1980-01-12', '555-1008', 'carmen.diaz@medtrack.com', 'DIFC800112MDFZLR07', 'DIFC800112K40', 'Recepcionista', 'F', 'L-V 7:00-15:00', NULL, NULL, 'Inactivo', '2025-11-19 02:51:14'),
(11, 1, 'Minerva', 'Caudana', 'Franco', '1971-03-08', '5523674814', 'mine.cdn@gmail.com', 'CAFM125789MVSPOY14', '7675798UUT87Y8', 'Medico', 'F', 'Matutino', '', 'RxH=PJ3V', 'Activo', '2025-11-19 04:39:42');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

DROP TABLE IF EXISTS `empresa`;
CREATE TABLE IF NOT EXISTS `empresa` (
  `id_empresa` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `correo_responsable` varchar(255) DEFAULT NULL,
  `nombre_responsable` varchar(255) DEFAULT NULL,
  `telefono_responsable` varchar(50) DEFAULT NULL,
  `direccion` text DEFAULT NULL,
  `estado` enum('Activa','Inactiva') DEFAULT 'Activa',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_empresa`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`id_empresa`, `nombre`, `correo_responsable`, `nombre_responsable`, `telefono_responsable`, `direccion`, `estado`, `created_at`) VALUES
(1, 'Clinica MedTrack', 'director@medtrack.com', 'Dr. Carlos Silva', '555-1001', 'Av. Central #123, Col. Médica, Ciudad', 'Activa', '2025-11-18 14:00:04'),
(2, 'TechSolutions SA de CV', 'juan.garcia@techsolutions.com', 'Juan García López', '555-2000', 'Av. Tecnología #456, Polígono Industrial Norte', 'Activa', '2025-11-19 02:51:14'),
(3, 'Constructora Moderna', 'maria.lopez@constructora.com', 'María López Hernández', '555-3000', 'Calle Obrero #789, Zona Industrial', 'Activa', '2025-11-19 02:51:14'),
(4, 'Hospital Regional Norte', 'dr.rodriguez@hrnorte.com', 'Dr. Roberto Rodríguez', '555-4000', 'Blvd. Médicos #321, Col. Centro', 'Activa', '2025-11-19 02:51:14'),
(5, 'Universidad del Valle', 'lic.mendoza@univalle.edu', 'Lic. Patricia Mendoza', '555-5000', 'Campus Universitario, Carretera Sur Km 5', 'Activa', '2025-11-19 02:51:14'),
(11, 'bbbb', 'mdlkvkfdmv@gmail.com', 'aaaaaa', '8114452674', '', 'Inactiva', '2025-11-19 03:11:27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_medico`
--

DROP TABLE IF EXISTS `historial_medico`;
CREATE TABLE IF NOT EXISTS `historial_medico` (
  `id_historial` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `tipo_sangre` varchar(10) DEFAULT NULL,
  `peso` decimal(6,2) DEFAULT NULL,
  `altura` decimal(5,2) DEFAULT NULL,
  `imc` decimal(6,2) DEFAULT NULL,
  `fecha_actualizacion` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id_historial`),
  KEY `id_paciente` (`id_paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial_medico`
--

INSERT INTO `historial_medico` (`id_historial`, `id_paciente`, `tipo_sangre`, `peso`, `altura`, `imc`, `fecha_actualizacion`) VALUES
(1, 1, 'O+', 65.50, 1.65, 24.10, '2025-11-19 02:51:14'),
(2, 2, 'A+', 78.20, 1.75, 25.55, '2025-11-19 02:51:14'),
(3, 3, 'B+', 58.00, 1.60, 22.66, '2025-11-19 02:51:14'),
(4, 4, 'AB+', 85.00, 1.80, 26.23, '2025-11-19 02:51:14'),
(5, 5, 'O-', 62.30, 1.68, 22.07, '2025-11-19 02:51:14'),
(6, 6, 'A-', 70.50, 1.72, 23.83, '2025-11-19 02:51:14'),
(7, 7, 'B-', 90.20, 1.85, 26.35, '2025-11-19 02:51:14'),
(8, 8, 'AB-', 55.80, 1.58, 22.36, '2025-11-19 02:51:14'),
(9, 9, 'O+', 68.70, 1.70, 23.77, '2025-11-19 02:51:14'),
(10, 10, 'A+', 74.10, 1.73, 24.76, '2025-11-19 02:51:14'),
(11, 11, NULL, NULL, NULL, NULL, '2025-11-19 03:30:19');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario_empleado`
--

DROP TABLE IF EXISTS `horario_empleado`;
CREATE TABLE IF NOT EXISTS `horario_empleado` (
  `id_horario` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(11) NOT NULL,
  `dia_semana` tinyint(4) NOT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_horario`),
  KEY `id_empleado` (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingreso_consulta`
--

DROP TABLE IF EXISTS `ingreso_consulta`;
CREATE TABLE IF NOT EXISTS `ingreso_consulta` (
  `id_ingreso` int(11) NOT NULL AUTO_INCREMENT,
  `id_consulta` int(11) NOT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_ingreso`),
  KEY `id_consulta` (`id_consulta`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingreso_consulta`
--

INSERT INTO `ingreso_consulta` (`id_ingreso`, `id_consulta`, `monto`, `fecha`) VALUES
(1, 1, 500.00, '2025-11-19 02:51:14'),
(2, 2, 500.00, '2025-11-19 02:51:14'),
(3, 3, 600.00, '2025-11-19 02:51:14'),
(4, 4, 500.00, '2025-11-19 02:51:14'),
(5, 5, 700.00, '2025-11-19 02:51:14'),
(6, 6, 500.00, '2025-11-19 02:51:14'),
(7, 7, 450.00, '2025-11-19 02:51:14'),
(8, 8, 550.00, '2025-11-19 02:51:14'),
(9, 9, 500.00, '2025-11-19 02:51:14'),
(10, 10, 650.00, '2025-11-19 02:51:14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

DROP TABLE IF EXISTS `inventario`;
CREATE TABLE IF NOT EXISTS `inventario` (
  `id_item` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `cantidad` int(11) DEFAULT 0,
  `unidad` varchar(50) DEFAULT NULL,
  `minimo_alerta` int(11) DEFAULT 0,
  PRIMARY KEY (`id_item`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`id_item`, `nombre`, `cantidad`, `unidad`, `minimo_alerta`) VALUES
(1, 'Paracetamol 500mg', 150, 'tabletas', 50),
(2, 'Ibuprofeno 400mg', 120, 'tabletas', 30),
(3, 'Amoxicilina 500mg', 80, 'tabletas', 20),
(4, 'Omeprazol 20mg', 100, 'tabletas', 25),
(5, 'Loratadina 10mg', 90, 'tabletas', 20),
(6, 'Metformina 850mg', 110, 'tabletas', 40),
(7, 'Enalapril 10mg', 95, 'tabletas', 30),
(8, 'Vacuna Influenza', 45, 'dosis', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

DROP TABLE IF EXISTS `paciente`;
CREATE TABLE IF NOT EXISTS `paciente` (
  `id_paciente` int(11) NOT NULL AUTO_INCREMENT,
  `id_empresa` int(11) DEFAULT NULL,
  `nombres` varchar(150) NOT NULL,
  `apellido_paterno` varchar(150) DEFAULT NULL,
  `apellido_materno` varchar(150) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `sexo` enum('M','F','Otro') DEFAULT 'Otro',
  `direccion` text DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo_electronico` varchar(200) DEFAULT NULL,
  `curp` varchar(30) DEFAULT NULL,
  `estado` enum('Activo','Inactivo') DEFAULT 'Activo',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_paciente`),
  KEY `id_empresa` (`id_empresa`),
  KEY `idx_paciente_nombre` (`nombres`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `id_empresa`, `nombres`, `apellido_paterno`, `apellido_materno`, `fecha_nacimiento`, `sexo`, `direccion`, `telefono`, `correo_electronico`, `curp`, `estado`, `created_at`) VALUES
(1, 2, 'María', 'García', 'López', '1990-08-15', 'F', 'Calle Flores #123, Col. Jardines', '555-5100', 'maria.garcia@techsolutions.com', 'GALM900815MDFRPR01', 'Activo', '2025-11-19 00:50:15'),
(2, 3, 'Carlos', 'Hernández', 'Martínez', '1985-03-22', 'M', 'Av. Industria #456, Col. Obrera', '555-5200', 'carlos.hernandez@constructora.com', 'HEMC850322HDFRRR02', 'Activo', '2025-11-19 00:50:15'),
(3, 4, 'Laura', 'Díaz', 'Sánchez', '1992-11-08', 'F', 'Blvd. Universitario #789, Col. Estudiantil', '555-5300', 'laura.diaz@email.com', 'DILC921108MDFZSR03', 'Activo', '2025-11-19 00:50:15'),
(4, 2, 'Roberto', 'Silva', 'Mendoza', '1978-12-10', 'M', 'Calle Roble #234, Col. Arboledas', '555-5400', 'roberto.silva@email.com', 'SIMR781210HDFLNB04', 'Activo', '2025-11-19 02:51:14'),
(5, 3, 'Isabel', 'Ortega', 'Reyes', '1988-07-25', 'F', 'Av. Constructores #567, Col. Obrera', '555-5500', 'isabel.ortega@email.com', 'OEEI880725MDFRYS05', 'Inactivo', '2025-11-19 02:51:14'),
(6, 4, 'Fernando', 'Castro', 'Gómez', '1995-04-18', 'M', 'Calle Estudiante #890, Col. Universitaria', '555-5600', 'fernando.castro@email.com', 'CAGF950418HDFSMR06', 'Activo', '2025-11-19 02:51:14'),
(7, 5, 'Gabriela', 'Morales', 'Pérez', '1982-09-30', 'F', 'Av. Salud #111, Col. Hospitalaria', '555-5700', 'gabriela.morales@email.com', 'MOPG820930MDFRRB07', 'Activo', '2025-11-19 02:51:14'),
(8, 2, 'Diego', 'Ríos', 'Hernández', '1991-02-14', 'M', 'Calle Tecnología #222, Col. Innovación', '555-5801', 'diego.rios@techsolutions.com', 'RIHD910214HDFSRG08', 'Activo', '2025-11-19 02:51:14'),
(9, 3, 'Patricia', 'Luna', 'García', '1975-06-05', 'F', 'Av. Construcción #333, Col. Obrera', '555-5900', 'patricia.luna@email.com', 'LUGP750605MDFNRT09', 'Activo', '2025-11-19 02:51:14'),
(10, 4, 'Sergio', 'Flores', 'Martínez', '1987-10-12', 'M', 'Blvd. Académico #444, Col. Universitaria', '555-6000', 'sergio.flores@email.com', 'FOMS871012HDFLRR10', 'Activo', '2025-11-19 02:51:14'),
(11, 1, 'Juan Pablo', 'Gonzalez', 'Antonio', '2005-03-30', 'M', 'Calle Luz #200, Col. Jardines', '5554562781', 'juan.gzza@gmail.com', 'AOCL83783879398U28U', 'Activo', '2025-11-19 03:30:19');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `receta`
--

DROP TABLE IF EXISTS `receta`;
CREATE TABLE IF NOT EXISTS `receta` (
  `id_receta` int(11) NOT NULL AUTO_INCREMENT,
  `id_consulta` int(11) NOT NULL,
  `contenido` text DEFAULT NULL,
  `creado_en` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_receta`),
  KEY `id_consulta` (`id_consulta`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `receta`
--

INSERT INTO `receta` (`id_receta`, `id_consulta`, `contenido`, `creado_en`) VALUES
(1, 2, 'Multivitamínico - 1 tableta diaria por 30 días', '2025-11-19 02:51:14'),
(2, 3, 'Vacuna influenza - 1 dosis aplicada', '2025-11-19 02:51:14'),
(3, 4, 'Ibuprofeno 400mg - 1 tableta cada 8 horas por 5 días si dolor', '2025-11-19 02:51:14'),
(4, 5, 'Relajante muscular - 1 tableta cada 12 horas por 3 días', '2025-11-19 02:51:14'),
(5, 9, 'Amoxicilina 500mg - 1 tableta cada 8 horas por 7 días', '2025-11-19 02:51:14'),
(6, 11, 'Loratadina 10mg - 1 tableta diaria por 15 días', '2025-11-19 02:51:14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_antecedente`
--

DROP TABLE IF EXISTS `tipo_antecedente`;
CREATE TABLE IF NOT EXISTS `tipo_antecedente` (
  `id_tipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id_tipo`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_antecedente`
--

INSERT INTO `tipo_antecedente` (`id_tipo`, `nombre`) VALUES
(1, 'Heredofamiliar'),
(2, 'Personal Patologico'),
(3, 'Ultimo Anio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `traslado_ambulancia`
--

DROP TABLE IF EXISTS `traslado_ambulancia`;
CREATE TABLE IF NOT EXISTS `traslado_ambulancia` (
  `id_traslado` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `origen` text DEFAULT NULL,
  `destino` text DEFAULT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `observaciones` text DEFAULT NULL,
  PRIMARY KEY (`id_traslado`),
  KEY `id_paciente` (`id_paciente`),
  KEY `id_empleado` (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(11) NOT NULL,
  `username` varchar(200) DEFAULT NULL,
  `password_hash` varchar(255) DEFAULT NULL,
  `rol` varchar(50) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `username` (`username`),
  KEY `id_empleado` (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `id_empleado`, `username`, `password_hash`, `rol`, `created_at`) VALUES
(1, 1, 'admin', 'admin123', 'ADMIN', '2025-11-18 23:42:18'),
(2, 2, 'arodriguez', 'medico123', 'MEDICO', '2025-11-18 23:42:18'),
(3, 3, 'pmartinez', 'enfermero123', 'ENFERMERO', '2025-11-18 23:42:18'),
(4, 4, 'lgutierrez', 'medico123', 'MEDICO', '2025-11-19 02:51:14'),
(5, 5, 'rfernandez', 'medico123', 'MEDICO', '2025-11-19 02:51:14'),
(6, 6, 'sramirez', 'enfermero123', 'ENFERMERO', '2025-11-19 02:51:14'),
(7, 7, 'mtorres', 'medico123', 'MEDICO', '2025-11-19 02:51:14'),
(8, 8, 'evargas', 'medico123', 'MEDICO', '2025-11-19 02:51:14'),
(9, 9, 'jmendoza', 'enfermero123', 'ENFERMERO', '2025-11-19 02:51:14'),
(10, 10, 'cdiaz', 'recepcion123', 'ENFERMERO', '2025-11-19 02:51:14');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `antecedente_registro`
--
ALTER TABLE `antecedente_registro`
  ADD CONSTRAINT `antecedente_registro_ibfk_1` FOREIGN KEY (`id_historial`) REFERENCES `historial_medico` (`id_historial`) ON DELETE CASCADE,
  ADD CONSTRAINT `antecedente_registro_ibfk_2` FOREIGN KEY (`id_condicion`) REFERENCES `catalogo_antecedente` (`id_condicion`);

--
-- Filtros para la tabla `catalogo_antecedente`
--
ALTER TABLE `catalogo_antecedente`
  ADD CONSTRAINT `catalogo_antecedente_ibfk_1` FOREIGN KEY (`id_tipo`) REFERENCES `tipo_antecedente` (`id_tipo`);

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE CASCADE,
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE SET NULL;

--
-- Filtros para la tabla `consulta`
--
ALTER TABLE `consulta`
  ADD CONSTRAINT `consulta_ibfk_1` FOREIGN KEY (`id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE,
  ADD CONSTRAINT `consulta_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `empleado` (`id_empleado`) ON DELETE SET NULL;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`) ON DELETE SET NULL;

--
-- Filtros para la tabla `historial_medico`
--
ALTER TABLE `historial_medico`
  ADD CONSTRAINT `historial_medico_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE CASCADE;

--
-- Filtros para la tabla `horario_empleado`
--
ALTER TABLE `horario_empleado`
  ADD CONSTRAINT `horario_empleado_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE CASCADE;

--
-- Filtros para la tabla `ingreso_consulta`
--
ALTER TABLE `ingreso_consulta`
  ADD CONSTRAINT `ingreso_consulta_ibfk_1` FOREIGN KEY (`id_consulta`) REFERENCES `consulta` (`id_consulta`) ON DELETE CASCADE;

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `empresa` (`id_empresa`) ON DELETE SET NULL;

--
-- Filtros para la tabla `receta`
--
ALTER TABLE `receta`
  ADD CONSTRAINT `receta_ibfk_1` FOREIGN KEY (`id_consulta`) REFERENCES `consulta` (`id_consulta`) ON DELETE CASCADE;

--
-- Filtros para la tabla `traslado_ambulancia`
--
ALTER TABLE `traslado_ambulancia`
  ADD CONSTRAINT `traslado_ambulancia_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`) ON DELETE SET NULL,
  ADD CONSTRAINT `traslado_ambulancia_ibfk_2` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE SET NULL;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_empleado`) REFERENCES `empleado` (`id_empleado`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
