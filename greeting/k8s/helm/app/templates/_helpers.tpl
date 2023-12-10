{{- define "env" -}}
{{- $dateNow := now | htmlDate -}}
{{- printf "default-%s-%s" .Chart.Version $dateNow -}}
{{- end -}}