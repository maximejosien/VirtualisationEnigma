git clone git@github.com:Akasam/samplephpwebsite.git

cd ./samplephpwebsite
git checkout v3
cd ../

docker-compose up -d --build php nginx db

echo "Terminer Site V3"
read ""

docker-compose down
rm -rf samplephpwebsite
