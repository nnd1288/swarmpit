(ns material.icon
  (:refer-clojure :exclude [remove key])
  (:require [material.factory :as f]))

(def home "M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z")

(def stacks "M24 7.501l-12-6-12 6 12 6 12-6zM12 3.491l8.017 4.008-8.017 4.008-8.017-4.008 8.017-4.008zM21.597 10.798l2.403 1.202-12 6-12-6 2.403-1.202 9.597 4.798zM21.597 15.298l2.403 1.202-12 6-12-6 2.403-1.202 9.597 4.798z")
(def services "M6.352 20.12l4.235-2.117v-3.462l-4.235 1.809v3.772zM5.646 15.11l4.456-1.908-4.456-1.908-4.456 1.908zM17.648 20.12l4.235-2.117v-3.462l-4.235 1.809v3.772zM16.941 15.11l4.456-1.908-4.456-1.908-4.456 1.908zM12 11.878l4.235-1.82v-2.933l-4.235 1.809v2.944zM11.294 7.698l4.864-2.084-4.864-2.084-4.864 2.084zM23.296 13.412v4.588q0 0.398-0.21 0.739t-0.574 0.519l-4.941 2.47q-0.277 0.154-0.628 0.154t-0.628-0.154l-4.941-2.47q-0.056-0.022-0.078-0.044-0.022 0.022-0.078 0.044l-4.941 2.47q-0.277 0.154-0.628 0.154t-0.628-0.154l-4.941-2.47q-0.364-0.177-0.574-0.519t-0.21-0.739v-4.588q0-0.42 0.237-0.771t0.623-0.53l4.786-2.051v-4.412q0-0.42 0.237-0.771t0.623-0.53l4.941-2.117q0.254-0.111 0.552-0.111t0.552 0.111l4.941 2.117q0.386 0.177 0.623 0.53t0.237 0.771v4.412l4.786 2.051q0.398 0.177 0.628 0.53t0.232 0.771z")
(def tasks "M12 21.817l8.571-4.674v-8.518l-8.571 3.121v10.071zM11.143 10.232l9.348-3.402-9.348-3.402-9.348 3.402zM22.286 6.857v10.286q0 0.469-0.241 0.871t-0.656 0.629l-9.429 5.143q-0.375 0.214-0.817 0.214t-0.817-0.214l-9.429-5.143q-0.415-0.228-0.656-0.629t-0.241-0.871v-10.286q0-0.536 0.308-0.978t0.817-0.629l9.429-3.429q0.295-0.107 0.589-0.107t0.589 0.107l9.429 3.429q0.509 0.188 0.817 0.629t0.308 0.978z")
(def repositories "M1.714 18.857h13.714v-1.714h-13.714v1.714zM1.714 12h13.714v-1.714h-13.714v1.714zM22.714 18q0-0.536-0.375-0.911t-0.911-0.375-0.911 0.375-0.375 0.911 0.375 0.911 0.911 0.375 0.911-0.375 0.375-0.911zM1.714 5.143h13.714v-1.714h-13.714v1.714zM22.714 11.143q0-0.536-0.375-0.911t-0.911-0.375-0.911 0.375-0.375 0.911 0.375 0.911 0.911 0.375 0.911-0.375 0.375-0.911zM22.714 4.286q0-0.536-0.375-0.911t-0.911-0.375-0.911 0.375-0.375 0.911 0.375 0.911 0.911 0.375 0.911-0.375 0.375-0.911zM24 15.429v5.143h-24v-5.143h24zM24 8.571v5.143h-24v-5.143h24zM24 1.714v5.143h-24v-5.143h24z")
(def nodes "M2 20h20v-4H2v4zm2-3h2v2H4v-2zM2 4v4h20V4H2zm4 3H4V5h2v2zm-4 7h20v-4H2v4zm2-3h2v2H4v-2z")
(def networks "M17 16l-4-4V8.82C14.16 8.4 15 7.3 15 6c0-1.66-1.34-3-3-3S9 4.34 9 6c0 1.3.84 2.4 2 2.82V12l-4 4H3v5h5v-3.05l4-4.2 4 4.2V21h5v-5h-4z")
(def volumes "M4.5 21h15c2.485 0 4.5-2.015 4.5-4.5h-24c0 2.485 2.015 4.5 4.5 4.5zM19.5 18h1.5v1.5h-1.5v-1.5zM22.5 3h-21l-1.5 12h24z")
(def secrets "M15.75 19.5v1.502c0 0.83-0.671 1.498-1.498 1.498h-11.254c-0.83 0-1.498-0.674-1.498-1.506v-17.239c0-0.832 0.674-1.506 1.506-1.506h7.494v4.501c0 0.834 0.674 1.499 1.504 1.499h3.746v1.5h-6.745c-1.245 0-2.255 1.007-2.255 2.249v5.252c0 1.242 1.002 2.249 2.255 2.249h6.745zM11.25 2.25v4.498c0 0.415 0.338 0.752 0.743 0.752h3.757l-4.5-5.25zM8.996 10.5c-0.826 0-1.496 0.675-1.496 1.494v5.262c0 0.825 0.677 1.494 1.496 1.494h12.758c0.826 0 1.496-0.675 1.496-1.494v-5.262c0-0.825-0.677-1.494-1.496-1.494h-12.758zM14.25 15v1.5h3v0.75h-3.75v-5.25h3.75v0.75h-3v1.5h2.25v0.75h-2.25zM9.75 15.225v2.025h-0.75v-5.25h0.75v2.025l2.025-2.025h0.975l-2.625 2.625 2.625 2.625h-0.975l-2.025-2.025zM20.25 15v2.25h-0.75v-2.25l-1.5-2.25v-0.75h0.75v0.75l1.125 1.688 1.125-1.688v-0.75h0.75v0.75l-1.5 2.25z")
(def configs "M15.75 19.5v1.502c0 .83-.671 1.498-1.498 1.498h-11.254c-.83 0-1.498-.674-1.498-1.506v-17.239c0-.832.674-1.506 1.506-1.506h7.494v4.501c0 .834.674 1.499 1.504 1.499h3.746v1.5h-6.745c-1.245 0-2.255 1.007-2.255 2.249v5.252c0 1.242 1.002 2.249 2.255 2.249h6.745zM11.25 2.25v4.498c0 .415.338 .752.743 .752h3.757l-4.5-5.25zM8.996 10.5zM15.67 15.518c-.42-.727-.167-1.658.564-2.082l-.786-1.362c-.225.132-.486.207-.764.207-.84 0-1.521-.685-1.521-1.531h-1.572c.002.261-.063.526-.203.768-.42.727-1.353.974-2.085.553l-.786 1.362c.226.129 .422.317 .562.559 .419.726 .168 1.656-.56 2.08l.786 1.362c.224-.131.484-.205.761-.205.838 0 1.517.681 1.521 1.523h1.572c-.001-.259.065-.52.203-.759.419-.726 1.35-.974 2.081-.555l.786-1.362c-.225-.129-.419-.316-.558-.556zM12.375 16.37c-.895 0-1.62-.725-1.62-1.62s.725-1.62 1.62-1.62c.895 0 1.62.725 1.62 1.62s-.725 1.62-1.62 1.62zM21.344 13.238c-.294-.509-.117-1.161.395-1.457l-.55-.953c-.157.092-.34.145-.535.145-.588 0-1.065-.479-1.065-1.072h-1.1c.001.183-.044.368-.142.538-.294.509-.947.682-1.459.387l-.55.953c.158.09 .295.222 .393.391 .293.508 .118 1.159-.392 1.456l.55.953c.157-.092.339-.143.533-.143.587 0 1.062.477 1.065 1.066h1.1c-.001-.181.046-.364.142-.531.293-.508.945-.682 1.457-.389l.55-.953c-.157-.09-.293-.221-.391-.389zM19.038 13.834c-.626 0-1.134-.508-1.134-1.134s.508-1.134 1.134-1.134c.627 0 1.134.508 1.134 1.134s-.508 1.134-1.134 1.134")
(def registries "M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zM12 22.5c-1.476 0-2.88-0.305-4.154-0.854l5.464-6.147c0.122-0.137 0.189-0.315 0.189-0.498v-2.25c0-0.414-0.336-0.75-0.75-0.75-2.648 0-5.442-2.753-5.47-2.78-0.141-0.141-0.331-0.22-0.53-0.22h-3c-0.414 0-0.75 0.336-0.75 0.75v4.5c0 0.284 0.161 0.544 0.415 0.671l2.585 1.293v4.404c-2.72-1.897-4.5-5.049-4.5-8.617 0-1.61 0.363-3.136 1.011-4.5h2.739c0.199 0 0.39-0.079 0.53-0.22l3-3c0.141-0.141 0.22-0.331 0.22-0.53v-1.814c0.951-0.283 1.957-0.436 3-0.436 1.65 0 3.211 0.381 4.6 1.059-0.097 0.082-0.192 0.168-0.282 0.259-0.85 0.85-1.318 1.98-1.318 3.182s0.468 2.332 1.318 3.182c0.854 0.854 1.997 1.319 3.179 1.319 0.074 0 0.149-0.002 0.223-0.006 0.324 1.214 0.908 4.375-0.197 8.727-0.010 0.041-0.016 0.082-0.020 0.122-1.906 1.947-4.563 3.156-7.503 3.156z")
(def users "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 3c1.66 0 3 1.34 3 3s-1.34 3-3 3-3-1.34-3-3 1.34-3 3-3zm0 14.2c-2.5 0-4.71-1.28-6-3.22.03-1.99 4-3.08 6-3.08 1.99 0 5.97 1.09 6 3.08-1.29 1.94-3.5 3.22-6 3.22z")
(def docker "M 13 1 L 13 4 L 16 4 L 16 1 L 13 1 z M 5 5 L 5 8 L 8 8 L 8 5 L 5 5 z M 9 5 L 9 8 L 12 8 L 12 5 L 9 5 z M 13 5 L 13 8 L 16 8 L 16 5 L 13 5 z M 18.3125 7.84375 C 17.9375 7.87975 17.29 8.50825 17 9.03125 C 16.271 10.34125 16.82875 11.98775 16.96875 12.34375 C 16.64375 12.76075 15 13 15 13 L 0.96875 13 C 0.14975 13.027 0.001 14.24625 0 14.53125 C -0.036 19.49925 3.71275 21.987 7.96875 22 C 14.13358 22.018583 17.872958 19.564326 20.03125 16 L 23 16 C 22.493 15.872 21.819 15.662 22 15 C 21.80025 15.29325 21.092953 15.582676 20.25 15.625 C 20.334084 15.475511 20.421079 15.340498 20.5 15.1875 C 21.825 15.1105 22.58725 14.4865 23.15625 13.9375 C 23.80825 13.3095 23.959 12.95375 24 12.59375 C 24.061 12.05075 22.61675 11.11425 20.84375 10.90625 C 20.67675 9.26025 18.8695 7.79075 18.3125 7.84375 z M 1 9 L 1 12 L 4 12 L 4 9 L 1 9 z M 5 9 L 5 12 L 8 12 L 8 9 L 5 9 z M 9 9 L 9 12 L 12 12 L 12 9 L 9 9 z M 13 9 L 13 12 L 16 12 L 16 9 L 13 9 z M 18.4375 9.9375 C 18.7265 10.2615 19.3115 10.99125 19.4375 11.65625 C 19.5185 12.09025 20.1225 12.42875 20.5625 12.46875 C 21.2515 12.53175 21.6735 12.66525 22.0625 12.78125 C 21.9325 13.02925 21.05425 13.549 19.78125 13.5 C 19.44325 13.486 19.127 13.686 19 14 C 18.920512 14.197611 18.63122 14.634487 18.21875 15.15625 C 18.132865 15.105608 18.05053 15.060427 17.96875 15 C 17.51475 15.425 15.35375 16.31 13.96875 15 C 13.18675 15.917 10.75175 15.917 9.96875 15 C 9.71575 15.704 6.59275 15.904 5.96875 15 C 5.79275 15.812 2.99275 16.2 1.96875 15 L 1.96875 15.5 C 1.9483496 15.326215 1.945011 15.155365 1.96875 15 C 1.96875 15 4.2906482 14.998577 5.96875 15 C 7.6468518 15.001423 8.0808363 14.999582 9.96875 15 C 11.856664 15.000418 13.339314 15.003018 13.96875 15 C 14.131026 14.999222 14.982748 15.001108 15 15 C 17.03 14.874 18.01075 13.763 18.34375 13.5 C 18.59575 13.301 18.852 12.78625 18.625 12.40625 C 18.609 12.37925 18.0035 10.6585 18.4375 9.9375 z M 2.0625 16 L 17.46875 16 C 15.737275 17.813076 12.570862 20.103441 7.96875 20 C 6.57575 19.969 5.09975 19.75375 4.09375 18.96875 C 5.79475 18.90975 7.28125 18.59375 7.28125 18.59375 C 7.71625 18.51075 7.98925 18.09025 7.90625 17.65625 C 7.82325 17.22125 7.40375 16.917 6.96875 17 C 6.93475 17.006 4.66775 17.5635 2.59375 17.3125 C 2.4760192 17.099583 2.2170137 16.569555 2.0625 16 z M 8.4375 17 C 8.1795 17 7.96875 17.21075 7.96875 17.46875 C 7.96875 17.72575 8.1805 17.9375 8.4375 17.9375 C 8.6955 17.9375 8.90625 17.72575 8.90625 17.46875 C 8.90625 17.40575 8.898 17.3675 8.875 17.3125 C 8.843 17.3705 8.7595 17.40625 8.6875 17.40625 C 8.5825 17.40625 8.53125 17.2925 8.53125 17.1875 C 8.53125 17.1175 8.53675 17.0955 8.59375 17.0625 C 8.54175 17.0415 8.4975 17 8.4375 17 z")
(def password "M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2zm-6 9c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm3.1-9H8.9V6c0-1.71 1.39-3.1 3.1-3.1 1.71 0 3.1 1.39 3.1 3.1v2z")

(def add "M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z")
(def remove "M19 13H5v-2h14v2z")
(def add-small "M13 7h-2v4H7v2h4v4h2v-4h4v-2h-4V7zm-1-5C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z")
(def remove-small "M7 11v2h10v-2H7zm5-9C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z")
(def trash "M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z")

(def expand "M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z")
;(def search "M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z")

(def wizard "M6 4.5l-3-3h-1.5v1.5l3 3zM7.5 0h1.5v3h-1.5zM13.5 7.5h3v1.5h-3zM15 3v-1.5h-1.5l-3 3 1.5 1.5zM0 7.5h3v1.5h-3zM7.5 13.5h1.5v3h-1.5zM1.5 13.5v1.5h1.5l3-3-1.5-1.5zM23.672 20.672l-14.909-14.909c-0.438-0.438-1.153-0.438-1.591 0l-1.409 1.409c-0.438 0.438-0.438 1.153 0 1.591l14.909 14.909c0.438 0.438 1.153 0.438 1.591 0l1.409-1.409c0.438-0.438 0.438-1.153 0-1.591zM11.25 12.75l-4.5-4.5 1.5-1.5 4.5 4.5-1.5 1.5z")
(def edit "M3 17.25V21h3.75L17.81 9.94l-3.75-3.75L3 17.25zM20.71 7.04c.39-.39.39-1.02 0-1.41l-2.34-2.34c-.39-.39-1.02-.39-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z")
(def redeploy "M12 6v3l4-4-4-4v3c-4.42 0-8 3.58-8 8 0 1.57.46 3.03 1.24 4.26L6.7 14.8c-.45-.83-.7-1.79-.7-2.8 0-3.31 2.69-6 6-6zm6.76 1.74L17.3 9.2c.44.84.7 1.79.7 2.8 0 3.31-2.69 6-6 6v-3l-4 4 4 4v-3c4.42 0 8-3.58 8-8 0-1.57-.46-3.03-1.24-4.26z")
(def rollback "M14 12c0-1.1-.9-2-2-2s-2 .9-2 2 .9 2 2 2 2-.9 2-2zm-2-9c-4.97 0-9 4.03-9 9H0l4 4 4-4H5c0-3.87 3.13-7 7-7s7 3.13 7 7-3.13 7-7 7c-1.51 0-2.91-.49-4.06-1.3l-1.42 1.44C8.04 20.3 9.94 21 12 21c4.97 0 9-4.03 9-9s-4.03-9-9-9z")

(def file-18 "M16.133 4.027c-0.39-0.532-0.935-1.155-1.532-1.753s-1.22-1.142-1.753-1.532c-0.907-0.665-1.346-0.742-1.598-0.742h-8.719c-0.775 0-1.406 0.631-1.406 1.406v15.188c0 0.775 0.631 1.406 1.406 1.406h12.938c0.775 0 1.406-0.631 1.406-1.406v-10.969c0-0.252-0.077-0.692-0.742-1.598zM13.805 3.070c0.54 0.54 0.963 1.027 1.276 1.43h-2.706v-2.706c0.404 0.313 0.891 0.736 1.43 1.276zM15.75 16.594c0 0.152-0.129 0.281-0.281 0.281h-12.938c-0.152 0-0.281-0.129-0.281-0.281v-15.188c0-0.152 0.129-0.281 0.281-0.281 0 0 8.718-0 8.719 0v3.938c0 0.311 0.252 0.563 0.563 0.563h3.938v10.969z")
(def compose-18 "M11.813 14.625v1.126c0 0.622-0.503 1.124-1.124 1.124h-8.44c-0.622 0-1.124-0.506-1.124-1.129v-12.929c0-0.624 0.506-1.129 1.13-1.129h5.62v3.376c0 0.625 0.505 1.124 1.128 1.124h2.809v1.125h-5.059c-0.934 0-1.691 0.755-1.691 1.687v3.939c0 0.932 0.752 1.687 1.691 1.687h5.059zM8.438 1.688v3.373c0 0.312 0.254 0.564 0.557 0.564h2.818l-3.375-3.938zM6.747 7.875c-0.62 0-1.122 0.506-1.122 1.121v3.946c0 0.619 0.508 1.121 1.122 1.121h9.569c0.62 0 1.122-0.506 1.122-1.121v-3.946c0-0.619-0.508-1.121-1.122-1.121h-9.569zM8.438 11.25v1.688h-0.563v-1.688l-1.125-1.688v-0.563h0.563v0.563l0.844 1.266 0.844-1.266v-0.563h0.563v0.563l-1.125 1.688zM11.531 10.688l0.844-1.688h0.563v3.938h-0.563v-2.813l-0.563 1.125h-0.563l-0.563-1.125v2.813h-0.563v-3.938h0.563l0.844 1.688zM16.313 12.375v0.563h-2.813v-3.938h0.563v3.375h2.25z")
(def expand-18 "M12.44 6.44L9 9.88 5.56 6.44 4.5 7.5 9 12l4.5-4.5z")

(def ok "M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z")
(def left "M15.41 16.09l-4.58-4.59 4.58-4.59L14 5.5l-6 6 6 6z")
(def right "M8.59 16.34l4.58-4.59-4.58-4.59L10 5.75l6 6-6 6z")

(def warn "M1 21h22L12 2 1 21zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z")
(def info "M11 17h2v-6h-2v6zm1-15C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zM11 9h2V7h-2v2z")
;(def error "M11 15h2v2h-2zm0-8h2v6h-2zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z")

(def tux "M20.581 19.049c-.55-.446-.336-1.431-.907-1.917.553-3.365-.997-6.331-2.845-8.232-1.551-1.595-1.051-3.147-1.051-4.49 0-2.146-.881-4.41-3.55-4.41-2.853 0-3.635 2.38-3.663 3.738-.068 3.262.659 4.11-1.25 6.484-2.246 2.793-2.577 5.579-2.07 7.057-.237.276-.557.582-1.155.835-1.652.72-.441 1.925-.898 2.78-.13.243-.192.497-.192.74 0 .75.596 1.399 1.679 1.302 1.461-.13 2.809.905 3.681.905.77 0 1.402-.438 1.696-1.041 1.377-.339 3.077-.296 4.453.059.247.691.917 1.141 1.662 1.141 1.631 0 1.945-1.849 3.816-2.475.674-.225 1.013-.879 1.013-1.488 0-.39-.139-.761-.419-.988zm-9.147-10.465c-.319 0-.583-.258-1-.568-.528-.392-1.065-.618-1.059-1.03 0-.283.379-.37.869-.681.526-.333.731-.671 1.249-.671.53 0 .69.268 1.41.579.708.307 1.201.427 1.201.773 0 .355-.741.609-1.158.868-.613.378-.928.73-1.512.73zm1.665-5.215c.882.141.981 1.691.559 2.454l-.355-.145c.184-.543.181-1.437-.435-1.494-.391-.036-.643.48-.697.922-.153-.064-.32-.11-.523-.127.062-.923.658-1.737 1.451-1.61zm-3.403.331c.676-.168 1.075.618 1.078 1.435l-.31.19c-.042-.343-.195-.897-.579-.779-.411.128-.344 1.083-.115 1.279l-.306.17c-.42-.707-.419-2.133.232-2.295zm-2.115 19.243c-1.963-.893-2.63-.69-3.005-.69-.777 0-1.031-.579-.739-1.127.248-.465.171-.952.11-1.343-.094-.599-.111-.794.478-1.052.815-.346 1.177-.791 1.447-1.124.758-.937 1.523.537 2.15 1.85.407.851 1.208 1.282 1.455 2.225.227.871-.71 1.801-1.896 1.261zm6.987-1.874c-1.384.673-3.147.982-4.466.299-.195-.563-.507-.927-.843-1.293.539-.142.939-.814.46-1.489-.511-.721-1.555-1.224-2.61-2.04-.987-.763-1.299-2.644.045-4.746-.655 1.862-.272 3.578.057 4.069.068-.988.146-2.638 1.496-4.615.681-.998.691-2.316.706-3.14l.62.424c.456.337.838.708 1.386.708.81 0 1.258-.466 1.882-.853.244-.15.613-.302.923-.513.52 2.476 2.674 5.454 2.795 7.15.501-1.032-.142-3.514-.142-3.514.842 1.285.909 2.356.946 3.67.589.241 1.221.869 1.279 1.696l-.245-.028c-.126-.919-2.607-2.269-2.83-.539-1.19.181-.757 2.066-.997 3.288-.11.559-.314 1.001-.462 1.466zm4.846-.041c-.985.38-1.65 1.187-2.107 1.688-.88.966-2.044.503-2.168-.401-.131-.966.36-1.493.572-2.574.193-.987-.023-2.506.431-2.668.295 1.753 2.066 1.016 2.47.538.657 0 .712.222.859.837.092.385.219.709.578 1.09.418.447.29 1.133-.635 1.49zm-8-13.006c-.651 0-1.138-.433-1.534-.769-.203-.171.05-.487.253-.315.387.328.777.675 1.281.675.607 0 1.142-.519 1.867-.805.247-.097.388.285.143.382-.704.277-1.269.832-2.01.832z")
(def win "M3,12V6.75L9,5.43V11.91L3,12M20,3V11.75L10,11.9V5.21L20,3M3,13L9,13.09V19.9L3,18.75V13M20,13.25V22L10,20.09V13.1L20,13.25Z")

(defn os
  [os]
  (if (= os "windows")
    win
    tux))

(def visibility (f/visibility-icon))
(def visibility-off (f/visibility-off-icon))
(def menu (f/menu-icon))
(def chevron-left (f/chevron-left-icon))
(def chevron-right (f/chevron-right-icon))
(def account-circle (f/account-circle-icon))
(def search (f/search-icon))
(def expand-more (f/expand-more-icon))
(def key (f/key-icon))
(def settings (f/settings-icon))
(def receipt (f/receipt-icon))
(def dns (f/dns-icon))
(def storage (f/storage-icon))
(def device-hub (f/device-hub-icon))

(def warning (f/warning-icon))
(def sync (f/sync-icon))
(def add-circle (f/add-circle-icon))
(def more (f/more-icon))
(def logs (f/logs-icon))

(def scroll-down (f/vertical-align-bottom-icon))

(defn cancel
  [props]
  (f/cancel-icon (clj->js props)))

(defn circle
  [props]
  (f/circle-icon (clj->js props)))

(defn access-time
  [props]
  (f/access-time-icon (clj->js props)))

(defn fingerprint
  [props]
  (f/fingerprint-icon (clj->js props)))

(defn label
  [props]
  (f/label-icon (clj->js props)))

(defn settings
  [props]
  (f/settings-icon (clj->js props)))

(defn check
  [props]
  (f/check-icon (clj->js props)))

(defn close
  [props]
  (f/close-icon (clj->js props)))

(defn info
  [props]
  (f/info-icon (clj->js props)))

(defn error
  [props]
  (f/error-icon (clj->js props)))

(defn check-circle
  [props]
  (f/check-circle-icon (clj->js props)))


