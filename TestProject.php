<?php

use PHPUnit\Framework\TestCase;

require "./samplephpwebsite/functions.php";
require "./samplephpwebsite/config.php";

class TestProject extends TestCase
{
    public function testSiteName()
    {
        $value = config('name');

        $current = siteName();

        $this->expectOutputString($value);
    }
}
