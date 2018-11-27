DROP TABLE IF EXISTS BANK_CONSENT_PERM;

DROP TABLE IF EXISTS BANK_CONSENT_DATA;

CREATE TABLE `bank_consent_data` (
  `consent_id` varchar(255) NOT NULL,
  `creation_date_time` datetime DEFAULT NULL,
  `expiration_date_time` datetime DEFAULT NULL,
  `status_val` varchar(255) DEFAULT NULL,
  `status_update_date_time` datetime DEFAULT NULL,
  `transaction_from_date_time` datetime DEFAULT NULL,
  `transaction_to_date_time` datetime DEFAULT NULL,
  PRIMARY KEY (`consent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `bank_consent_perm` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL,
  `consent_id` varchar(255) NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `FK_CONSENT_ID` (`consent_id`),
  CONSTRAINT `FK_CONSENT_ID` FOREIGN KEY (`consent_id`) REFERENCES `bank_consent_data` (`consent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

