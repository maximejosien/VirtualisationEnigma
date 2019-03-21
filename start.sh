git clone git@github.com:Akasam/samplephpwebsite.git

docker-compose up -d --build php nginx

echo "Terminer Site V1"
read ""

docker-compose down
rm -rf samplephpwebsite
