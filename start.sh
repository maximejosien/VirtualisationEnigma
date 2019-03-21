git clone git@github.com:Akasam/samplephpwebsite.git

cd ./samplephpwebsite
git checkout v2
cd ../

docker-compose up -d --build php nginx

echo "Terminer Site V2"
read ""

docker-compose down
rm -rf samplephpwebsite
