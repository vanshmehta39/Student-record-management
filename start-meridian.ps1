# Run Meridian without Maven. Set the MySQL credentials for this terminal session first.
param(
  [string]$DbUser = "root",
  [string]$DbPassword = ""
)
$env:DB_USERNAME = $DbUser
$env:DB_PASSWORD = $DbPassword
$jar = Join-Path $PSScriptRoot "target\meridian-1.0.0.jar"
if (-not (Test-Path -LiteralPath $jar)) {
  Write-Host "The application JAR is missing. Install Maven, then run: mvn package" -ForegroundColor Red
  exit 1
}
Write-Host "Starting Meridian at http://localhost:8080" -ForegroundColor Green
java -jar $jar
