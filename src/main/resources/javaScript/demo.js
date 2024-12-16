function naveen(bandi){
var payload =JSON.stringify(
{
  "AdditionalInfo": {
    "ADIE": [
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "10 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_PORT-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_ACCESS-ATT_ACC_SPD": "10 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "20 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_PORT-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_ACCESS-ATT_ACC_SPD": "20 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "50 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_PORT-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_ACCESS-ATT_ACC_SPD": "50 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "100 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_PORT-ATT_INTERFACE": "100Base-TXElectrical",
        "PRD_ACCESS-ATT_ACC_SPD": "100 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "400 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "500 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "600 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "1000 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "10G baseLR SMF",
        "PRD_PORT-ATT_INTERFACE": "10G baseLR SMF",
        "PRD_ACCESS-ATT_ACC_SPD": "10 Gbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "100GBase LR4",
        "PRD_PORT-ATT_INTERFACE": "100GBase LR4",
        "PRD_ACCESS-ATT_ACC_SPD": "100 Gbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "150 Mbps",
        "serviceType": "ETHERNET"
      },
      {
        "PRD_PORT_MM-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_PORT-ATT_INTERFACE": "1000Base-LX Optical SMF;1000Base-SX Optical MMF",
        "PRD_ACCESS-ATT_ACC_SPD": "250 Mbps",
        "serviceType": "ETHERNET"
      }
    ],
    "AIA-B": [
      {
        "serviceCode": "4G LTE",
        "upStreamSpeed": "1 - 10 Mbps",
        "downStreamSpeed": "10 - 71 Mbps"
      }
    ],
    "BVOIP": [
      {
        "OFF_IPFLEX-ATT_911_SERVICE_AVAILABLE": "Yes"
      }
    ]
  },
  "Dependencies": {
    "PRD_PORT_MM": {
      "PRD_ACCESS-ATT_ACC_SPD": {
        "250 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "150 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "100 Gbps": {
          "ATT_INTERFACE": [
            "100GBase LR4"
          ]
        },
        "10 Gbps": {
          "ATT_INTERFACE": [
            "10G baseLR SMF"
          ]
        },
        "1000 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "600 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "500 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "400 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "100 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "50 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "20 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "10 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        }
      }
    },
    "PRD_PORT": {
      "PRD_ACCESS-ATT_ACC_SPD": {
        "250 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "150 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "100 Gbps": {
          "ATT_INTERFACE": [
            "100GBase LR4"
          ]
        },
        "10 Gbps": {
          "ATT_INTERFACE": [
            "10G baseLR SMF"
          ]
        },
        "1000 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "600 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "500 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "400 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF"
          ]
        },
        "100 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "50 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "20 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        },
        "10 Mbps": {
          "ATT_INTERFACE": [
            "1000Base-LX Optical SMF",
            "1000Base-SX Optical MMF",
            "100Base-TXElectrical"
          ]
        }
      }
    }
  },
  "Constraints": {
    "PRD_PORT_MM": {
      "ATT_INTERFACE": [
        "1000Base-LX Optical SMF",
        "1000Base-SX Optical MMF",
        "100Base-TXElectrical",
        "10G baseLR SMF",
        "100GBase LR4"
      ]
    },
    "PRD_PORT": {
      "ATT_INTERFACE": [
        "1000Base-LX Optical SMF",
        "1000Base-SX Optical MMF",
        "100Base-TXElectrical",
        "10G baseLR SMF",
        "100GBase LR4"
      ]
    },
    "PRD_ACCESS": {
      "ATT_ACC_SPD": [
        "10 Mbps",
        "20 Mbps",
        "50 Mbps",
        "100 Mbps",
        "400 Mbps",
        "500 Mbps",
        "600 Mbps",
        "1000 Mbps",
        "10 Gbps",
        "100 Gbps",
        "150 Mbps",
        "250 Mbps"
      ]
    },
    "OFF_IPFLEX": {
      "ATT_911_SERVICE_AVAILABLE": [
        "Yes"
      ]
    }
  }
}
);
var n = "naveen "+bandi;
var p = [payload,n];
return p;
}